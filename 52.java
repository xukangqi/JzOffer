/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        int len1 = 0;
        int len2 = 0;
        ListNode temp1=pHead1;
        ListNode temp2=pHead2;

        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }
        temp1=pHead1;
        temp2=pHead2;
        while (len1 > len2) {
            temp1 = temp1.next;
            len1--;
        }
        while (len2 > len1) {
            temp2 = temp2.next;
            len2--;
        }

        while (temp1 != null && temp2 != null) {
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}