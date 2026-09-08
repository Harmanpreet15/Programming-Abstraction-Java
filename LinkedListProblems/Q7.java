// LEETCODE - 143
// REORDER LIST

// ---------- during finding the middle node the condition used below if we want first middle element when the list is even otherwise we use another method ---------------

public class Q7 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(second != null) {
            ListNode next = second.next;
            second.next = prev;

            prev = second;
            second = next;
        }

        second = prev;

        while(second != null){
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext; 
            second = secondNext;
        }
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

        reorderList(n1);

        System.out.println("After:");
        printList(n1);
    }
}