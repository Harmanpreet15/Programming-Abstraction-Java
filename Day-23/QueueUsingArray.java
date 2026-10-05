
class Queue{
    int[] arr;
    int front;
    int rear;
    int size;
    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int value){
        if(rear == size-1){
            System.out.println("Queue overflow");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear++;
        arr[rear] = value;
        System.out.println(value + " Inserted");
    }

    void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue underflow");
            return;
        }

        System.out.println(arr[front] + " Removed");
        front++;
    }

    void peek(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front Element : " + arr[front]);
    }

    void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }

        for(int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();
    }
}
