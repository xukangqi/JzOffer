import java.util.Stack;

public class Solution {
   private static Stack<Integer> stack1=new Stack<>();
   private static Stack<Integer> stack2=new Stack<>();
    public void push(int node) {
        stack1.push(node);
        if(stack2.empty()==true){
            stack2.push(node);
            return;
        }
        if(node<stack2.peek()){
            stack2.push(node);
        }else{
            int temp=stack2.peek();
            stack2.push(temp);
        }
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();

    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}