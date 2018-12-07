/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public void deleteNode(ListNode pHead,ListNode toBeDeleted)
    {
       if(pHead==null||toBeDeleted==null){
             ;
       }else if(toBeDeleted.next!=null){
         toBeDeleted.val=toBeDeleted.next.val;
         toBeDeleted.next=toBeDeleted.next.next;
       }else if(pHead==toBeDeleted){
            pHead=toBeDeleted=null;
            
       }else{
        while(pHead.next!=toBeDeleted){
            pHead=pHead.next;
        }
        pHead.next=null;
       }
    }
}