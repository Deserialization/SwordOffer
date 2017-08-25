package cn.it.test2;

import java.util.Stack;

public class TestOffer22 {
	public boolean isPopOrder(int[] pushA,int[] popA) {
		Stack<Integer> stack = new Stack<Integer>();		
		if (pushA.length == 0 || popA.length == 0) {
			return false;
		}
		int popnum = 0;		
		for (int i = 0; i < popA.length; i++) {
			stack.push(pushA[i]);
			while(!stack.isEmpty() && stack.peek() == popA[popnum]){
				stack.pop();
				popnum++;
			}
		}
		return stack.empty();
	}
	public static void main(String[] args) {
		int[] array1={1,2,3,4,5};
		int[] array2={4,3,5,2,1};
		TestOffer22 test=new TestOffer22();
		System.out.println(test.isPopOrder(array1, array2));
		}

}


