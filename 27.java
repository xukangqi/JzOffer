/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}java
*/
public class Solution {
    public void Mirror(TreeNode root) {
         if(root==null){
             return ;
         }else{
             Mirror(root.left);
             Mirror(root.right);
             TreeNode temp=root.left;
             root.left=root.right;
             root.right=temp;
             return; 
         }
    }
}