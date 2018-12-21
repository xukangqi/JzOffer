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
    public int count;
    public TreeNode result;
    public int total;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null||k==0){
            return  null;
        }
        result=null;
        count=0;
        total=k;
        find(pRoot);
        return result;
    }
    public void find(TreeNode pRoot){
        if(pRoot.left!=null){
            find(pRoot.left);
        }
        if(count==total){
            return;
        }
        count++;
        if(count==total){
            result=pRoot;
            return ;
        }
        if(pRoot.right!=null){
            find(pRoot.right);
        }
    }

}