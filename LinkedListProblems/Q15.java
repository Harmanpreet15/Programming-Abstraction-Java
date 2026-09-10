// LEETCODE - 2
// -------------- Add Two Numbers ------------

public class Q15 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int val1 = 0;
            if(l1 != null){
                val1 = l1.val;
            }

            int val2 = 0;
            if(l2 != null){
                val2 = l2.val;
            }

            int sum = val1 + val2 + carry;

            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }

        }

        return dummy.next;
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

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.println("First number (reverse order):");
        printList(l1);

        System.out.println("Second number (reverse order):");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("Result:");
        printList(result);
    }
}