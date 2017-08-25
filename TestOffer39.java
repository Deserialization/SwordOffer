package cn.it.test2;

public class TestOffer39 {

	public int TreeDeep(TreeNode root){
		if (root == null) {
			return 0;
		}
		int pNodeleft = TreeDeep(root.left);
		int pNoderight = TreeDeep(root.right);
		//return pNodeleft > pNoderight ? pNodeleft + 1: pNoderight + 1;
		return Math.max(pNodeleft, pNoderight) + 1;
	}
}