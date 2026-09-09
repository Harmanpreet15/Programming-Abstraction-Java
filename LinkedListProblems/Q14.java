// LEETCODE - 1721
// Swapping Nodes in a linked list


public class Q14 {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;

        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }

        ListNode first = fast;
        ListNode second = head;

        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }

    public static void printList(ListNode head) {

        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" → ");
            }
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.println("Original list:");
        printList(head);

        head = swapNodes(head, k);

        System.out.println("After swapping:");
        printList(head);
    }
}
