
class MyCircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int count;
    private int capacity;

    public MyCircularQueue(int k) {
        arr = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        count++;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        count--;

        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return arr[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}

public class LeetCode622 {
    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(3);

        System.out.println(q.enQueue(10)); // true
        System.out.println(q.enQueue(20)); // true
        System.out.println(q.enQueue(30)); // true
        System.out.println(q.enQueue(40)); // false

        System.out.println("Front: " + q.Front()); // 10
        System.out.println("Rear: " + q.Rear());   // 30

        System.out.println("Dequeue: " + q.deQueue()); // true

        System.out.println(q.enQueue(40)); // true

        System.out.println("Front: " + q.Front()); // 20
        System.out.println("Rear: " + q.Rear());   // 40

        System.out.println("Is Empty: " + q.isEmpty()); // false
        System.out.println("Is Full: " + q.isFull());   // true
    }
}