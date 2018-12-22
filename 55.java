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
    public int maxdepth;
    public int TreeDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        find(root,1);
        return maxdepth;
    }
    public void find(TreeNode root,int depth){
        if(depth>maxdepth){
            maxdepth=depth;
        }
        if(root.left!=null){
            find(root.left,depth+1);
        }
        if(root.right!=null){
            find(root.right,depth+1);
        }
    }
}

public class Solution {
    public boolean flag;
    public boolean IsBalanced_Solution(TreeNode root) {
        flag=true;
        judge(root);
        return flag;
    }
    public int judge(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=judge(root.left);
        int right=judge(root.right);
        if(left-right>1||right-left>1){
            flag=false;
        }
        return (left>right?left:right)+1;
    }
}