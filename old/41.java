import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Solution {
   public ArrayList<Integer> GetLeastNumbers_Solution(int[] input) {
       int capacity=0;
          capacity=input.length/2;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k);
        for (int i = 0; i <input.length; i++) {
            if (maxHeap.size() != capacity) {
                maxHeap.add(input[i]);
            } else {
                maxHeap.add(input[i]);
                Integer temp = maxHeap.poll();
               minHeap.add(temp);
            }
        }
        return (maxHeap.peek()+minHeap.peek())/2;
    }
}