import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    public  PriorityQueue<Integer> maxHeap=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });
    public int count=0;
    public void Insert(Integer num) {
        //先放小根堆，再放大根堆
        if(count%2==0){
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }else{
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
        count++;
        
    }

    public Double GetMedian() {
        if(count%2==0){
           return (minHeap.peek()+maxHeap.peek())/2.0;
        }else{
          return minHeap.peek()+0.0;
        }
        
    }


}