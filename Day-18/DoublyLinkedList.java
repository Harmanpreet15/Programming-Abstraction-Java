public class DoublyLinkedList{

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }

    static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev = head;
        second.next=third;
        third.prev=second;
        third.next=fourth;
        fourth.prev=third;

        print(head);

    }
}
