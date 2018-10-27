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
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null){
            return true;
        }else{
            return visitRoot(pRoot, pRoot);
        }
    }

    private boolean visitRoot(TreeNode root,TreeNode anotherRoot){
        if(root==null&&anotherRoot==null){
             return true;
        }else if(root!=null&&anotherRoot==null){
            return false;
        }else if(root==null&&anotherRoot!=null){
            return false;
        }else{
            boolean result=visitRoot(root.left, anotherRoot.right)&&visitRoot(root.right, anotherRoot.left);
            if(result&&root.val==anotherRoot.val){
                return true;
            }else{
                return false;
            }
        }
    }
}