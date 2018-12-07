public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = null;
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {
            if (list1.val <= list2.val) {
                head = list1;
                list1 = list1.next;
            } else {
                head = list2;
                list2 = list2.next;
            }
            ListNode temp=head;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    head.next = list1;
                    head = head.next;
                    list1 = list1.next;
                } else {
                    head.next = list2;
                    head = head.next;
                    list2 = list2.next;
                }
            }
            while (list1 != null) {
                head.next = list1;
                head = head.next;
                list1 = list1.next;
            }
            while (list2 != null) {
                head.next = list2;
                head = head.next;
                list2 = list2.next;
            }
            return temp;
        }

    }
}