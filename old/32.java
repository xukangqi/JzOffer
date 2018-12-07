import java.util.*;

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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
       
        Queue<TreeNode> queue=new LinkedList();
        ArrayList arrayList=new ArrayList<>();
        if(root==null){
            return arrayList;
        }
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode treeNode=queue.poll();
            arrayList.add(treeNode.val);
            if(treeNode.left!=null){
                queue.add(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.add(treeNode.right);
            }
        }
        return arrayList;
    }
}