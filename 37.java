import java.util.LinkedList;
import java.util.Queue;



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
    String Serialize(TreeNode root) {
        if(root==null){
            return "#";
        }
         StringBuilder stringBuilder=new StringBuilder();
          Queue<TreeNode> queue=new LinkedList<>();
          queue.add(root);
          stringBuilder.append(root.val+",");
          while(!queue.isEmpty()){
                TreeNode temp= queue.poll();
                if(temp.left!=null){
                     stringBuilder.append(temp.left.val+",");
                     queue.add(temp.left);
                }else{
                    stringBuilder.append("#,");
                }

                if(temp.right!=null){
                     queue.add(temp.right);
                     stringBuilder.append(temp.right.val+",");
                }else{
                    stringBuilder.append("#,");
                }
          }
          return stringBuilder.toString();

    }
    TreeNode Deserialize(String str) {
        if(str.equals("#")){
            return null;
        }
        String[] strings=str.split(",");
        return build(strings,0);
}

    public TreeNode build(String[] strings,int index){
         if(index>=strings.length||strings[index].equals("#")){
             return null;
         }
         TreeNode root=new TreeNode(Integer.parseInt(strings[index]));
         root.left=build(strings, index*2+1);
         root.right=build(strings, index*2+2);
         return root;
    }
}