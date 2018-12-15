import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null) {
            return false;
        }
        if (pushA.length == 0 && popA.length == 0) {
            return true;
        }
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }

        Stack < Integer > stack = new Stack < > ();
        int i = 0;
        int j = 0;
        while (i < popA.length && j < pushA.length) {
            if (stack.isEmpty()) {
                stack.add(pushA[j]);
                j++;
                continue;
            }
            if (stack.peek() != popA[i]) {
                stack.add(pushA[j]);
                j++;
            } else {
                i++;
                stack.pop();
            }
        }
        while(i < popA.length ){
            if (stack.peek() == popA[i]) {
                i++;
                stack.pop();
            }else{
                break;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}