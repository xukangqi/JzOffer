import java.util.HashMap;

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    // public RandomListNode Clone(RandomListNode pHead)
    // {
    //     HashMap<RandomListNode,RandomListNode> hashMap=new HashMap<>();

    //     if(pHead==null){
    //         return pHead;
    //     }
    //     RandomListNode a=pHead;
    //     RandomListNode root= new RandomListNode(pHead.label);
    //     hashMap.put(pHead,root);
    //     RandomListNode b=root;
    //     RandomListNode c=root;
    //     if(pHead.next==null){
    //        return root;
    //     }
       
    //     while(pHead.next!=null){
    //         root.next=new RandomListNode(pHead.next.label);
    //         root=root.next;
    //         pHead=pHead.next;
    //         hashMap.put(pHead,root);
    //     }
    //     while(b!=null){
    //         RandomListNode temp=hashMap.get(a.random);
    //         b.random=temp;
    //         a=a.next;
    //         b=b.next;
    //     }
    //     return  c;
    // }

    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return pHead;
        }
        RandomListNode temp=pHead;
        while(temp!=null){
            RandomListNode newNode=new RandomListNode(temp.label);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=newNode.next;
        }
        temp=pHead;
        while(temp!=null){
            RandomListNode  next=temp.next;
            if(temp.random!=null){
                next.random=temp.random.next;
            }else{
                next.random=null;
            }
            temp=next.next;
        }
        //最后一步有点小问题
        RandomListNode root=pHead.next;
        temp=root;
        while(temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return root;
    }

}