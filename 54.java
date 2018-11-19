/*
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
    public int total;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null){
            return null;
        }
        total=k;
    return find(pRoot);
    }

    TreeNode find(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left!=null){
            TreeNode result=find(root.left);
            if(result!=null){
                return result;
            }
        }
        if(total==1){
            total-=1;
            return root;
        }else{
            total-=1;
            if(root.right==null){
                return null;
            }
            return find(root.right);
        }
    }


}