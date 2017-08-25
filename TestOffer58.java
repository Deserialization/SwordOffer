package cn.it.test2;

public class TestOffer58 {

    public TreeNode GetNext(TreeNode node)
    {
        if(node==null)return null;
        if(node.right!=null)
        {
            node=node.right;
            while(node.left!=null)
            {
                node=node.left;

            }return node;
        }
        while(node.next!=null)
        {
            if(node.next.left==node)return node.next;
            node=node.next;
        }
        return null;
    }
}


