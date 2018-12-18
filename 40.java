import java.util.*;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if(input.length<k){
            return new ArrayList<Integer>();
        }
        if(k==0){
            return new ArrayList<Integer>();
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(input[i]);
            } else {
//                System.out.println("peek "+priorityQueue.peek());
                if (priorityQueue.peek() > input[i]) {
                    priorityQueue.poll();
                    priorityQueue.add(input[i]);
                }
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            arrayList.add(priorityQueue.poll());
        }
//        for (Integer integer : arrayList) {
//            System.out.println(integer);
//        }
        Collections.reverse(arrayList);
        return  arrayList;
    }
}