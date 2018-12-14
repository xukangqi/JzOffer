import java.util.Stack;

public class Solution {
    public Stack < Integer > stack = new Stack < > ();
    public Stack < Integer > minstack = new Stack < > ();

    public void push(int node) {
        stack.add(node);
        if (minstack.isEmpty()) {
            minstack.add(node);
        } else {
            if (minstack.peek() > node) {
                minstack.add(node);
            } else {
                minstack.add(minstack.peek());
            }
        }
    }

    public void pop() {
       stack.pop();
       minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
         return minstack.peek();
    }
}