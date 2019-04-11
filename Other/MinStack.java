import java.util.*;

public class MinStack {

    // We try to implement the MinStack using two stacks
    // One for push, pop and top, 
    // The other for maintaining the value of the minimum element in the stack
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()) {
            stack2.push(x);
        } else {
            stack2.push(Math.min(stack2.peek(), x));
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int minVal() {
        return stack2.peek();
    }

    public static void main(String args[]) {

        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(2);
        ms.push(5);

        System.out.println(ms.top());
        System.out.println(ms.minVal());

        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.minVal());

    }

}































