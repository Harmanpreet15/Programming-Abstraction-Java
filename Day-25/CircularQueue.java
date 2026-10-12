public class CircularQueue {

    static class CirQueue{
        int[] arr;
        int front, rear, size, capacity;

        CirQueue(int capacity){
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int value){
            if(size == capacity){
                System.out.println("Circular Queue is full");
                return;
            }

            rear = (rear + 1) % capacity;
            arr[rear] = value;
            size++;
            System.out.println("Inserted " + value);
        }

        void dequeue(){
            if(size == 0){
                System.out.println("Circular Queue is Empty");
                return ;
            }

            System.out.println("Element removed " + arr[front]);
            front = (front+1) % capacity;
            size--;
        }

        void display(){
            if(size == 0){
                System.out.println("Circular Queue is Empty");
                return ;
            }

            System.out.println("Queue :" );

            for(int i=0; i<size; i++){
                int index = (front+i) % capacity;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // nextIndex = (currentIndex + 1) mod n;
        // n = 5
        // rear = 4;
        // (4 + 1) mod 5 --> 0


        CirQueue q = new CirQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.display();

    }
}
