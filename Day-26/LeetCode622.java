public class LeetCode622 {

    static class MyCircularQueue {

        int[] arr;
        int front;
        int rear;
        int size;
        int capacity;

        public MyCircularQueue(int k) {
            arr = new int[k];
            front = 0;
            rear = -1;
            size = 0;
            capacity = k;
        }

        public boolean enQueue(int value) {
           if(isFull()){
               return false;
           }

           rear = (rear+1) % capacity;
           arr[rear] = value;
           size++;

           return true;
        }

        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }

            front = (front+1) % capacity;
            size--;

            return true;
        }

        public int Front() {
            if(isEmpty()){
                return -1;
            }

            return arr[front];
        }

        public int Rear() {
            if(isEmpty()){
                return -1;
            }

            return arr[rear];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue: ");

            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                System.out.print(arr[index] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        MyCircularQueue q = new MyCircularQueue(4);

        System.out.println(q.enQueue(10));
        System.out.println(q.enQueue(20));
        System.out.println(q.enQueue(30));

        System.out.println("Dequeue: " + q.deQueue());

        System.out.println(q.enQueue(40));
        System.out.println(q.enQueue(50));

        System.out.println("Dequeue: " + q.deQueue());

        System.out.println(q.enQueue(60));

        q.display();

        System.out.println("Front index: " + q.front);
        System.out.println("Rear index: " + q.rear);
        System.out.println("Size: " + q.size);

        System.out.println("Front element: " + q.Front());
        System.out.println("Rear element: " + q.Rear());
        System.out.println("Is Full: " + q.isFull());
        System.out.println("Is Empty: " + q.isEmpty());
    }
}
