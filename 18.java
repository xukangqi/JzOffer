/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode DeleteNode(ListNode head, ListNode node) {
        if (head == null || node == null) {
            return null;
        }
        if (head == node) {
            return null;
        }
        ListNode temp = head;
        while (temp.next != node) {
            temp = temp.next;
        }
        temp.next = node.next;
        return head;
    }
}

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        } else if (pHead.next == null) {
            return pHead;
        } else {
            if (pHead.val == pHead.next.val) {
                int val = pHead.next.val;
                pHead = pHead.next.next;
                while (pHead != null && pHead.val == val) {
                    pHead = pHead.next;
                }
                return deleteDuplication(pHead);
            } else {
                pHead.next = deleteDuplication(pHead.next);
                return pHead;
            }
        }
    }
}