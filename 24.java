/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    private ListNode root;
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=head.next;
        ListNode newHead=head;
        while(temp!=null){
            head.next=temp.next;
            temp.next=newHead;
            newHead=temp;
            temp=head.next;
        }
        
        return newHead;
        // reverse(head);
        // return root;
    }

    // public ListNode reverse(ListNode head){
    //     if(head.next==null){
    //         root=head;
    //         return head;
    //     }else{
    //         ListNode node=reverse(head.next);
    //         node.next=head;
    //         return head;
    //     }
    // }
}