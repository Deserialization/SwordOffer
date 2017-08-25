package cn.it.test2;

public class TestOffer19 {
/*	public static void main(String[] args) {
		TreeNode root1=new TreeNode(8);
		TreeNode node1=new TreeNode(8);
		TreeNode node2=new TreeNode(7);
		TreeNode node3=new TreeNode(9);
		TreeNode node4=new TreeNode(2);
		TreeNode node5=new TreeNode(4);
		TreeNode node6=new TreeNode(7);
		root1.left=node1;
		root1.right=node2;
		node1.left=node3;
		node1.right=node4;
		node4.left=node5;
		node4.right=node6;

		TestOffer19 test=new TestOffer19();
		TreeNode rootTreeNode=test.Mirror(root1);
		System.out.println(root1.left.data);
		System.out.println(root1.right.data);
		}*/
	public TreeNode Mirror(TreeNode root1){	
		if (root1 == null) {
			return null;
		}
		if (root1.left == null && root1.right == null) {
			return null;
		}
		TreeNode temp = root1.left;
		root1.left = root1.right;
		root1.right = temp;
		if (root1.left != null) {
			Mirror(root1.left);			
		}
		if (root1.right != null) {
			Mirror(root1.right);
		}
		return root1;
		
	}
	
}