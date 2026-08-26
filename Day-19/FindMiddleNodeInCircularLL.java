public class FindMiddleNodeInCircularLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    static Node head=null;
    static void insert(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            new_node.next = head;
            return;
        }
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = head;
    }

    public static int mid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next!=head && fast.next.next!=head ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        System.out.println(mid(head));
    }
}
