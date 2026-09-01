public class LlistMiddle {
    
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node findMid(Node head){
        // floyd's algorithm
        
        if(head==null) return head;
        Node slow=head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("mid: "+findMid(head).data);
    }
}
