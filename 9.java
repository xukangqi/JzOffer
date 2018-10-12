import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        if(stack1.size()==stack1.capacity()){
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                stack1.push(node);
            }
        }else{
            stack1.push(node);
        }
    }
    
    public int pop() {
       if(!stack2.isEmpty()){
           return stack2.pop();
       }else{
        
               while(!stack1.isEmpty()){
                   stack2.push(stack1.pop());
               }
               return stack2.pop();
       }
    }
}