import java.util.HashMap;

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

    // public ListNode EntryNodeOfLoop(ListNode pHead)
    // { 
    //     if(pHead==null){
    //         return null;
    //     }
    //     HashMap<Integer,Integer> hashMap=new HashMap<>();
    //     while(pHead.next!=null){
    //         if(hashMap.containsKey(pHead.val)){
    //             return pHead;
    //         }
    //         hashMap.put(pHead.val,1);
    //         pHead=pHead.next;
    //     }
    //     return null;
    // }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //第一步
        ListNode a = pHead;
        ListNode b = pHead;
        boolean flag = false;
        while (a.next != null && a.next.next != null && b.next != null) {
            a = a.next.next;
            b = b.next;
            if (a == b) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        }
        //第二步 
        int count = 0;
        while (a.next != b) {
            a = a.next;
            count++;
        }
        count++;
       
        //第三步java
        a = pHead;
        b = pHead;
        for (int i = 0; i < count; i++) {
            b = b.next;
        }
        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;


    }
}