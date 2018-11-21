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
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null){
            return null;
        }
        if(pNode.right!=null){
            pNode=pNode.right;
            while(pNode.left!=null){
                pNode=pNode.left;
            }
            return pNode;
        }
        //右变为空，子级别遍历完成
        if(pNode.next!=null&&pNode.next.left==pNode){
            return pNode.next;
        }

        if(pNode.next!=null&&pNode.next.right==pNode){
            while(pNode.next != null && pNode.next.left != pNode){
                pNode = pNode.next ;
            }
            return pNode.next;
        }
        return pNode.next;

    }
}

public class Solution {
    int[] hashtable=new int[256];
    StringBuilder stringBuilder=new StringBuilder();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(hashtable[ch]==0){
            hashtable[ch]=1;
        }else{
            hashtable[ch]+=1;
        } 
        stringBuilder.append(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chars=stringBuilder.toString().toCharArray();

     for(char ch:chars){
         if(hashtable[ch]==1){
             return ch;
         }
     }
     return '#';
    }
}