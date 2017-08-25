package cn.it.test2;

import java.lang.ProcessBuilder.Redirect;

public class TestOffer39_1 {

	public boolean isBalance(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
			return false;
		}
		return isBalance(root.left) && isBalance(root.right);		
	}

	private int getHeight(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}
		return max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	private int max(int height, int height2) {
		// TODO Auto-generated method stub
		return (height > height2) ? height :height2;		
	}
	
}