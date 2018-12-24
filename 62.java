import java.util.*;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1){
            return  -1;
        }
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<n;i++){
            linkedList.add(i);
        }
        int current=0;
        while(linkedList.size()!=1){
            current=(current+m-1)%linkedList.size();
            linkedList.remove(current);
        }
       System.out.println(linkedList.get(0));
        return linkedList.get(0);
   }
}