public class Solution {
    public boolean flag;
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        flag=true;
        judge(root);

        return flag;

    }
    public int judge(TreeNode root){
        if(root==null){
            return 0;
        }
        if(flag==false){
            return 0;
        }
        int llen=judge(root.left);
        int rlen=judge(root.right);
        if(llen-rlen<=1&&llen-rlen>=-1){
            return llen>rlen?llen+1:rlen+1;
        }else{
            flag=false;
            return llen>rlen?llen+1:rlen+1;
        }
    }
}