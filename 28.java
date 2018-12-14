import java.util.Stack;

/*
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
 
    boolean isSymmetrical(TreeNode pRoot)
    {
         return findPre( pRoot,  pRoot) ;
    }
    public boolean findPre(TreeNode a,TreeNode b){
         if(a==null&&b==null){
             return true;
         }
         if(a==null||b==null){
             return false;
         }
         if(a.val==b.val){
          return findPre(a.left, b.right)&&findPre(a.right, b.left);
         }else{
            return false;
         }
    }
}