// LEETCODE - 206
// REVERSE LINKED LIST

public class Q5 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while ((curr != null)) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }

        return prev;
    }

    public static void printList(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Before:");
        printList(n1);

        ListNode result = reverseList(n1);

        System.out.println("After:");
        printList(result);
    }
}