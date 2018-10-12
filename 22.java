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
        ListNode a=head;
        ListNode b=head;
        if(k<=0){
            return null;
        }
        for(int i=0;i<k;i++){
            if(a==null){
                return null;
            }else{
                a=a.next;
            }
        }
        if(a==null){
            return b;
        }else{
            while(a!=null){
                a=a.next;
                b=b.next;
            }
            return b;
        }
    }
}