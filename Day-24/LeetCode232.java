import java.util.*;

class MyQueue {
    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    public void push(int x) {
        inStack.push(x);
    }

    private void moveElements() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    public int pop() {
        moveElements();
        return outStack.pop();
    }

    public int peek() {
        moveElements();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}

public class LeetCode232 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Front: " + queue.peek());
        System.out.println("Pop: " + queue.pop());

        queue.push(40);

        System.out.println("Front: " + queue.peek());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Is Empty: " + queue.empty());
    }
}
