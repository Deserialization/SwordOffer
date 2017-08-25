package cn.it.test2;

public class TestOffer27 {
	public TreeNode Convert(TreeNode pRootOfTree){
		if (pRootOfTree ==null) {
			return null;
		}if (pRootOfTree.left == null && pRootOfTree.right == null) {
			return pRootOfTree;
		}
		TreeNode pLastNodeOfList = Convert(pRootOfTree.left);
		TreeNode pNode = pLastNodeOfList;
		while(pNode != null && pNode.right != null){
			pNode = pNode.right;
		}
		if (pLastNodeOfList != null) {
			pNode.right = pRootOfTree;
			pRootOfTree.left = pNode;
		}
		TreeNode pLastNodeRightOfList = Convert(pRootOfTree.right);
		if (pLastNodeRightOfList != null) {
			pLastNodeRightOfList.left = pRootOfTree;
			pRootOfTree.right = pLastNodeRightOfList;
		}
		if (pLastNodeOfList != null) {
			return pLastNodeOfList;
		}
		
		return pRootOfTree;
	}
    public static void main(String[] args) {
        TreeNode pRootOfTree = new TreeNode(10);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(14);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(12);
        TreeNode node6 = new TreeNode(16);

        pRootOfTree.left = node1;
        pRootOfTree.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        TreeNode node = new TestOffer27().Convert(pRootOfTree);

        while(node != null){
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

}

