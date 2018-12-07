
// Definition for binary tree
 public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
       return Build(0, pre.length-1, 0, in.length-1, pre, in);
    }
    public TreeNode Build(int preLeft,int preRight,int inLeft,int inRight,int[] pre,int[] in){
        if(preLeft>preRight||inLeft>inRight){
            return null;
        }else{
            int center=pre[preLeft];
            TreeNode treeNode=new TreeNode(center);
            int i=0;
            for(i=inLeft;i<=inRight;i++){
                if(in[i]==center){
                    break;
                }
            }
            int llen=i-inLeft;
            int rlen=inRight-i;
            treeNode.left=Build(preLeft+1,preLeft+llen, inLeft,i-1, pre, in);
            treeNode.right=Build(preLeft+llen+1,preRight, i+1, inRight, pre, in);
            return treeNode;
        }
    }
}