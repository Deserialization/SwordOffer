package cn.it.test2;

import java.io.PushbackInputStream;
import java.util.Stack;

/**
 解题步骤：就是先放入一个栈中，然后在倒入另外一个栈中，如果是一个栈中为空，另外一个栈不为空，
 那么就应该有元素的弹入到没有元素里面的栈中，然后在把最终的那个栈弹出。
 
 *
 */
public class TestOffer7 {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void push(int node) {		
		stack1.push(node);
	}
	public int pop() {
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		int first = stack2.pop();			
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return first;
	}
    public static void main(String[] args) {
    	TestOffer7 demo05 = new TestOffer7();
        demo05.push(1);
        demo05.push(2);
        demo05.push(5);
        demo05.push(4);
        System.out.println(demo05.pop());
        System.out.println(demo05.pop());
        demo05.push(3);
        System.out.println(demo05.pop());
        System.out.println(demo05.pop());
        System.out.println(demo05.pop());
    }

}	


