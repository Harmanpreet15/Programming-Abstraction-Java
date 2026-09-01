public class LlistReverse {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev = null;
        Node nextptr = null;
        while(curr!=null){
            nextptr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextptr;
        }
        return prev;
    }

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("----------Original Linked List----------");
        print(head);

        head = reverse(head);
        System.out.println("----------Reversed Linked List----------");
        print(head);
    }
}