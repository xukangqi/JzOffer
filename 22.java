/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
      int i=0;
      ListNode temp=head;
      while(i<k&&head!=null){
         head=head.next;
         i++;
      }
      if(i!=k){
          return null;
      }
       int j=0;
    while(head!=null){
        head=head.next;
      temp=temp.next;
    }
    return temp;
    }
}