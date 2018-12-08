/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        } else {
            while(pNode!=null){
                if(pNode.next!=null){
                    TreeLinkNode temp=pNode;
                    pNode=pNode.next;
                    if(temp==pNode.left){
                        return pNode;
                    }else{
                        ;
                    }
                }else{
                    return null;
                }
            }
            return null;
        }


    }
    
}