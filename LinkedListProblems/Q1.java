// LEETCODE - 138
// Copy List with Random Pointers
import java.util.*;

public class Q1 {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        if(head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node curr = head;
        while(curr != null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            Node c = map.get(curr);
            c.next = map.get(curr.next);
            c.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        n1.random = n3;
        n2.random = n1;
        n3.random = null;

        Node copyHead = copyRandomList(n1);

        Node curr = copyHead;

        while (curr != null) {
            System.out.println(
                "Value: " + curr.val +
                ", Random: " +
                (curr.random == null ? "null" : curr.random.val)
            );

            curr = curr.next;
        }
    }
}
