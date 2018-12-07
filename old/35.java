// public class RandomListNode {
// int label;
// RandomListNode next = null;
// RandomListNode random = null;

// RandomListNode(int label) {
// this.label = label;
// }
// }

//没感觉有问题啊
public class Solutionjava {
    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode head = pHead;
        if (pHead == null) {
            return null;
        }
        while (pHead != null) {
            RandomListNode randomListNode = new RandomListNode(pHead.label);
            randomListNode.next = pHead.next;
            pHead.next = randomListNode;
            pHead = randomListNode.next;
        }
        pHead = head;
        while (pHead != null) {
            RandomListNode randomListNode = pHead.next;
            //坑点
            randomListNode.random = pHead.random==null?null:pHead.random.next;
            pHead = pHead.next.next;
        }
        pHead = head;
        RandomListNode randomListNode = pHead.next;
        RandomListNode temp= randomListNode;
        pHead = pHead.next.next;
        while (pHead != null) {
            randomListNode.next = pHead.next;
            randomListNode = randomListNode.next;
            pHead = pHead.next.next;
        }

        return temp;

    }
}