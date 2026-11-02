public class LeetCode641 {

    static class MyCircularDeque {

        int[] arr;
        int front, rear, size, capacity;

        public MyCircularDeque(int k) {
            arr = new int[k];
            capacity = k;
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean insertFront(int value) {
            if(isFull()){
                return false;
            }

            if(isEmpty()){
                front = 0;
                rear = 0;
            }else{
                front = (front-1+capacity) % capacity;
            }

            arr[front] = value;
            size++;

            return true;
        }

        public boolean insertLast(int value) {
            if(isFull()){
                return false;
            }

            if(isEmpty()){
                front = 0;
                rear = 0;
            }else{
                rear = (rear+1) % capacity;
            }

            arr[rear] = value;
            size++;

            return true;
        }

        public boolean deleteFront() {
            if(isEmpty()){
                return false;
            }

            if(size == 1){
                front = 0;
                rear = -1;
            }else{
                front = (front+1) % capacity;
            }

            size--;
            return true;
        }

        public boolean deleteLast() {
            if(isEmpty()){
                return false;
            }

            if(size == 1){
                front = 0;
                rear = -1;
            }else{
                rear = (rear-1+capacity) % capacity;
            }

            size--;
            return true;
        }

        public int getFront() {
            if(isEmpty()){
                return -1;
            }

            return arr[front];
        }

        public int getRear() {
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
                System.out.println("Deque is empty");
                return;
            }

            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MyCircularDeque dq = new MyCircularDeque(3);

        System.out.println(dq.insertLast(1));
        System.out.println(dq.insertLast(2));
        System.out.println(dq.insertFront(3));
        System.out.println(dq.insertFront(4));

        System.out.println("Front: " + dq.getFront());
        System.out.println("Rear: " + dq.getRear());

        System.out.println("Delete Last: " + dq.deleteLast());

        System.out.println("Insert Front: " + dq.insertFront(4));

        System.out.print("Final Deque: ");
        dq.display();
    }
}
