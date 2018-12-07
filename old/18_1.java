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
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        } else if (pHead.next == null) {
            return pHead;
        } else {
           if(pHead.val==pHead.next.val){
                ListNode temp=pHead.next;
                while(temp!=null&&temp.val==pHead.val){
                    temp=temp.next;
                }
                return deleteDuplication(temp);
           }else{
               pHead.next=deleteDuplication(pHead.next);
               return pHead;
           }
        }
    }
}