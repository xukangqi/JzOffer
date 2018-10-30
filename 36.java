// import javax.swing.tree.TreeNode;

/**
public class TreeNode {
int val = 0;
TreeNode left = null;
TreeNode right = null;

public TreeNode(int val) {
this.val = val;

}

}
*/
public class Solution {
    public TreeNode phead;
    public TreeNode temp;
    public TreeNode Convert(TreeNode pRootOfTree) {
        phead = null;
        temp = null;
        if( pRootOfTree==null){
            return null;
        }
        inorder(pRootOfTree);
        return temp;

    }
    public void inorder(TreeNode root) {
        if(root==null){
            return;
        }
        if (root.left != null) {
            inorder(root.left);
        }
        if (phead == null) {
            phead = root;
            temp = root;

        } else {
            phead.right = root;
            root.left = phead;
            phead = root;
        }
        if (root.right != null) {
            inorder(root.right);
        }
    }
}