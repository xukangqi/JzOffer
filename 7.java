/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return build(pre, in, 0, pre.length-1, 0, in.length-1);
    }

    public TreeNode build(int [] pre,int [] in,int pLeft,int pRight,int iLeft,int iRight){
         if(pLeft>pRight||iRight<iLeft){
             return null;
         }
         TreeNode root=new TreeNode(pre[pLeft]);
         int i=iLeft;
         while(in[i]!=pre[pLeft]){
             i++;
         }
         int len=i-iLeft;
         root.left=build(pre, in, pLeft+1, pLeft+len, iLeft, i-1);
         root.right=build(pre, in, pLeft+len+1, pRight, i+1, iRight);
         return root;
    }
}