package cn.it.test2;

import java.util.Stack;

public class TestOffer25 {

	public static void findPath(TreeNode root,int sum){
		if (root == null) {
			return;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int currentSum = 0;
		findPath(root, sum, stack, currentSum);
	}
	private static void findPath(TreeNode root, int sum, Stack<Integer> stack, int currentSum) {
		// TODO Auto-generated method stub
		currentSum += root.data;
		stack.push(root.data);
		if (root.left == null && root.right == null) {
			if (sum ==currentSum) {
				System.out.println("找到路径");
				for (int path : stack) {
					System.out.print(path + " ");
				}				
				System.out.println();
			}
		}
		if (root.left != null) {
			findPath(root.left, sum, stack, currentSum);
		}
		if (root.right != null) {
			findPath(root.right, sum, stack, currentSum);
		}
		stack.pop();		
	}
	public static void main(String[] args) {
	        {
	            TreeNode root1 = new TreeNode(10);
	            TreeNode node1 = new TreeNode(5);
	            TreeNode node2 = new TreeNode(12);
	            TreeNode node3 = new TreeNode(4);
	            TreeNode node4 = new TreeNode(7);
	            root1.left = node1;
	            root1.right = node2;
	            node1.left = node3;
	            node1.right = node4;

	            TestOffer25 testFindPath = new TestOffer25();
	            testFindPath.findPath(root1, 22);
	        }
	    }


}


