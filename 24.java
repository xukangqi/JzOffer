/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        while(head!=null){
            ListNode a=head.next;
            head.next=temp;
            temp=head;
            head=a;
        }java
        return temp;
    }
}