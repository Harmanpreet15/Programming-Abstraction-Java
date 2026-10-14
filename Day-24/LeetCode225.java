
class MyStack {
    java.util.Queue<Integer> q = new java.util.LinkedList<>();

    public void push(int x) {
        q.offer(x);

        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class LeetCode225 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.empty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.empty());
    }
}
