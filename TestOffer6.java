package cn.it.test2;


public class TestOffer6 {
	public static TreeNode reConstructBinaryTree(int[] pre,int[] in){
		TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1,in,0,in.length-1);
		return root;
	}

	private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn,
			int endIn) {

		// 开始位置大于结束位置说明已经处理到叶节点了
		if (startPre > endPre || startIn > endIn)
			return null;
		TreeNode root = new TreeNode(pre[startPre]);// 寻找根节点
		// 最好把迭代写在循环外
		for (int i = startIn; i <= endIn; i++)
			if (in[i] == pre[startPre]) {
				// 我的理解是从startPre位置越过左孩子及其子节点的偏移量（即i-startIn， 中序定位根节点的长度。
				// 因为startIn和i之间全是i这个元素的左孩子及其子节点）再往下一个节点走（即右孩子起始点），
				// 如果写成startPre+(i-startIn)+1可能要容易看懂些，
				root.left = reConstructBinaryTree(pre, startPre + 1, startPre + (i - startIn), in, startIn, i - 1);
				// 递归左子树：前序起始位+1,前序起始位+中序定位根节点的长度，中序起始位不变，中序结束位为定位到的坐标
				root.right = reConstructBinaryTree(pre, (i - startIn) + startPre + 1, endPre, in, i + 1, endIn);
				// 递归右子树:(前序起始位+左子树长度+1(根节点)),前序结束位不变，右子树为中序根节点+1,中序结束位保持不变

				// 递归思想，每次将左右两颗子树当成新的子树进行处理，中序的左右子树索引很好找，前序的开始结束索引通过计算中序中左右子树的大小来计算，然后递归求解，
				// 直到startPre>endPre||startIn>endIn说明子树整理完到。方法每次返回左子树活右子树的根节点
			}
		System.out.print(root.data);
		return root;
	}
    public static void main(String[] args) {       
        int pre[]= { 1, 2, 4, 7, 3, 5, 6, 8 };
        int in[] = { 4, 7, 2, 1, 5, 3, 8, 6 };
      
        TreeNode root = reConstructBinaryTree(pre, in);

    }

}


