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
    public TreeNode root = null;
    public TreeNode temp;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        find(pRootOfTree);
        return root;
    }

    public void find(TreeNode pRootOfTree) {
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            if (root == null) {
                root = pRootOfTree;
                temp = root;
            } else {
                temp.right = pRootOfTree;
                pRootOfTree.left = temp;
                temp = pRootOfTree;
            }
        } else {
            if (pRootOfTree.left != null) {
                find(pRootOfTree.left);
            }
            if (root == null) {
                root = pRootOfTree;
                temp = root;
            } else {
                temp.right = pRootOfTree;
                pRootOfTree.left = temp;
                temp = pRootOfTree;
            }
            if (pRootOfTree.right != null) {
                find(pRootOfTree.right);
            }
        }
    }
}