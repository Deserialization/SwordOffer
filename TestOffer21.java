package cn.it.test2;

import java.util.Iterator;
import java.util.Stack;

public class TestOffer21 {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> stack1 = new Stack<Integer>();
	public void push(int node){
		stack.push(node);
	}
	public void pop(){
		stack.pop();
	}
	public int top(){
		return stack.peek();
	}
	public int min(){
		int min = stack.peek();
		while(!stack.isEmpty()){
			int node = stack.pop();
			if (node < min) {
				min = node;
			}
			stack1.push(node);
		}
		while(!stack1.isEmpty()){
			stack.push(stack1.pop());
		}
		     
		return min;
	}
	public static void main(String[] args) {
		TestOffer21 test=new TestOffer21();
		test.push(3);
		test.push(2);
		test.push(1);
		test.push(4);
		test.push(5); 

		System.out.println(test.min());
		}
}


