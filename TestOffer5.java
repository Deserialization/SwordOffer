package cn.it.test2;

import java.util.ArrayList;
import java.util.Stack;


public class TestOffer5 {

/*	public static ArrayList<Integer> printNode(Node node){
		Stack<Integer> stack = new Stack<>();
		while(node != null){
			stack.push(node.value);
			node = node.next;
		}
		ArrayList<Integer> list = new ArrayList<>();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
		return list;
	}*/
	
	public void printNode(Node node){
		if (node != null) {
			if (node.next != null) {
				printNode(node.next);
			}
		}
		System.out.println(node.value);
	}

	public static void main(String args[]) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
/*		node1.value = 1;
		node2.value = 2;
		node3.value = 3;*/
		node1.next = node2;
		node2.next = node3;
		TestOffer5 test = new TestOffer5();
		//System.out.println(test.printNode(node1));
		test.printNode(node1);
	}
	
}


