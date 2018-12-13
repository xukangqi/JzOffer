/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head=null;
        if(list1.val>list2.val){
            head=list2;
            list2=list2.next;
        }else{
            head=list1;
            list1=list1.next;
        }
        ListNode temp=head;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                temp.next=list2;
                list2=list2.next;
            }else{
                temp.next=list1;
                list1=list1.next;
            }
           temp=temp.next;
        }

        while(list1!=null){
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }
        while(list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        return head;
    }
}