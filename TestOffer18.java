package cn.it.test2;

public class TestOffer18 {
	public boolean subTree(TreeNode root1, TreeNode root2){
		boolean flag = false;

		if (root1!=null && root2 != null) {			
			if (root1.data == root2.data) {
				flag = HaveTree2(root1,root2);
			}
			if (!flag) {
				flag = HaveTree2(root1.left,root2);
			}if (!flag) {
				flag = HaveTree2(root1.right,root2);
			}
		}
		
		return flag;
	}

	private boolean HaveTree2(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if (root1 == null) {
			return false;
		}
		if (root1 != null && root2 == null) {
			return true;
		}
		if (root1.data == root2.data) {
			return true;
		}
		return HaveTree2(root1.left, root2.left) && HaveTree2(root1.right, root2.right);
	}

}