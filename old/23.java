public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindCircle(ListNode head) {
       ListNode meetNode=meet(head);
       if(meetNode==null){
           return null;
       }
       //节点数目
       int number=1;
       ListNode temp=head;
       while(temp.next!=meetNode){
           number++;
           temp=temp.next;  
       }
       temp=head;
       for(int i=0;i<number;i++){
             temp=temp.next;
       }
       ListNode a=head;
       while(a!=temp){
           temp=temp.next;
           a=a.next;
       }
       return a;

    }

    public ListNode meet(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = slow.next;

        if (slow == null) {
            return null;
        }
        while (fast != null && slow != null) {
            if (fast == slow) {
                return fast;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        }
        return null;
    }
}