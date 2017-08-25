package cn.it.test2;

public class TestOffer59 {

    boolean isSymmetrical(TreeNode pRoot)
    {
        TreeNode node = getMirror(pRoot);
        return isSymmetrical(pRoot,node);
    }
    boolean isSymmetrical(TreeNode pRoot,TreeNode node)
    {
        if(pRoot == null && node == null){
            return true;
        }else if(pRoot == null || node  == null){
            return false;
        }
        if(pRoot.data == node.data){
            return isSymmetrical(pRoot.left,node.left)&&isSymmetrical(pRoot.right,node.right);
        }
       return false;
    }

    TreeNode getMirror(TreeNode pRoot){
        if (pRoot == null) {
            return null;
        }
        TreeNode root = new TreeNode(pRoot.data);
        root.right = getMirror(pRoot.left);
        root.left = getMirror(pRoot.right);
        return root;
    }

}



