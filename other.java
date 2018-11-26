/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        //右变为空，子级别遍历完成
        if (pNode.next != null && pNode.next.left == pNode) {
            return pNode.next;
        }

        if (pNode.next != null && pNode.next.right == pNode) {
            while (pNode.next != null && pNode.next.left != pNode) {
                pNode = pNode.next;
            }
            return pNode.next;
        }
        return pNode.next;

    }
}

public class Solution {
    int[] hashtable = new int[256];
    StringBuilder stringBuilder = new StringBuilder();
    //Insert one char from stringstream
    public void Insert(char ch) {
        if (hashtable[ch] == 0) {
            hashtable[ch] = 1;
        } else {
            hashtable[ch] += 1;
        }
        stringBuilder.append(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char[] chars = stringBuilder.toString().toCharArray();

        for (char ch: chars) {
            if (hashtable[ch] == 1) {
                return ch;
            }
        }
        return '#';
    }
}

import java.util.ArrayList;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList < ArrayList < Integer > > Print(TreeNode pRoot) {
        boolean flag = false;
        TreeNode last = pRoot;
        BlockingQueue < String > queue = new LinkedBlockingQueue < String > ();
        queue.add(pRoot);
        while (queue.) {

        }
    }
}

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public int index = -1;
    String Serialize(TreeNode root) {
        StringBuffer stringBuffer = new StringBuffer();
        if (root == null) {
            stringBuffer.append("#,");
            return stringBuffer.toString();
        } else {
            stringBuffer.append(root.val + ",");
            stringBuffer.append(Serialize(root.left));
            stringBuffer.append(Serialize(root.right));
            return stringBuffer.toString();
        }

    }
    TreeNode Deserialize(String str) {
        index++;
        String[] strings = str.split(",");
        TreeNode node = null;
        if (!strings[index].equals("#")) {
            node = new TreeNode(Integer.valueOf(strings[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;

    }
   

    /*
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    */
    ArrayList < ArrayList < Integer > > Print(TreeNode pRoot) {

        ArrayList < ArrayList < Integer > > arraylist=new  ArrayList < ArrayList < Integer > > ();
        if(pRoot==null){
            return arraylist;
        }
        Queue<TreeNode> queue=new LinkedList<>();
       int last=0;
       int index=-1;
       queue.add(pRoot);
       ArrayList<Integer> arrayList=new ArrayList<>();
       while(!queue.isEmpty()){
           index++;
           TreeNode treeNode=queue.poll();
           arrayList.add(treeNode.val);
           if(treeNode.left!=null){
               queue.add(treeNode.left);
           }
           if(treeNode.right!=null){
               queue.add(treeNode.right);
           }
           if(index==last){
               index=-1;
               last=queue.size()-1;
               arraylist.add(arrayList);
               arrayList=new ArrayList<>();
           }
       }
       return  arraylist;

    }
}


public class Solution {

    private PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    private int count=0;
    public void Insert(Integer num) {

        if (count %2 == 0) {//当数据总数为偶数时，新加入的元素，应当进入小根堆
            //（注意不是直接进入小根堆，而是经大根堆筛选后取大根堆中最大元素进入小根堆）
            //1.新加入的元素先入到大根堆，由大根堆筛选出堆中最大的元素
            maxHeap.offer(num);
            int filteredMaxNum = maxHeap.poll();
            //2.筛选后的【大根堆中的最大元素】进入小根堆
            minHeap.offer(filteredMaxNum);
        } else {//当数据总数为奇数时，新加入的元素，应当进入大根堆
            //（注意不是直接进入大根堆，而是经小根堆筛选后取小根堆中最大元素进入大根堆）
            //1.新加入的元素先入到小根堆，由小根堆筛选出堆中最小的元素
            minHeap.offer(num);
            int filteredMinNum = minHeap.poll();
            //2.筛选后的【小根堆中的最小元素】进入大根堆
            maxHeap.offer(filteredMinNum);
        }
        count++;


    }

    public Double GetMedian() {
        if (count %2 == 0) {
            return new Double((minHeap.peek() + maxHeap.peek())) / 2;
        } else {
            return new Double(minHeap.peek());
        }
    }


}