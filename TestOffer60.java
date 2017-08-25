package cn.it.test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestOffer60 {

	public static void printNode(TreeNode root) {        
		//一个变量表示在当前的层中还没有打印的结点数，
		int current = 1;
		//另一个变量表示下一次结点的数目。
        int next = 0;        		
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			current--;
			System.out.print(node.data + " ");			
			if (node.left != null) {				
				queue.add(node.left);
				next++;
			}
			if (node.right != null) {				
				queue.add(node.right);
				next++;
			}

			if (current == 0) {
				System.out.println();
				current = next;
				next = 0;
			}
		}
		
	}
	   public static void main(String[] args) {
	        TreeNode n1 = new TreeNode(1);
	        TreeNode n2 = new TreeNode(2);
	        TreeNode n3 = new TreeNode(3);
	        TreeNode n4 = new TreeNode(4);
	        TreeNode n5 = new TreeNode(5);
	        TreeNode n6 = new TreeNode(6);
	        TreeNode n7 = new TreeNode(7);
	        TreeNode n8 = new TreeNode(8);
	        TreeNode n9 = new TreeNode(9);
	        n1.left = n2;
	        n1.right = n3;
	        n2.left = n4;
	        n2.right = n5;
	        n3.left = n6;
	        n3.right = n7;
	        n4.left = n8;
	        n4.right = n9;
	        printNode(n1);
	    }
}


