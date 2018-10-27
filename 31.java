import java.util.*;


public class Solution {


    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack < Integer > stack = new Stack < > ();
        if(popA.length==0||pushA.length==0){
            return false;
        }
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.empty()&&j<popA.length&&stack.peek()==popA[j]){
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}