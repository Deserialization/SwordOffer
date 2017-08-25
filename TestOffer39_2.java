package cn.it.test2;

public class TestOffer39_2 {

	public boolean isBalance(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (Math.abs(deepth(root.left) - deepth(root.right)) > 1) {
			return false;			
		}else{
			return isBalance(root.left) && isBalance(root.right);
		}		
	}

	private int deepth(TreeNode root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}
		return Math.max(deepth(root.left), deepth(root.right));
	}	
}