// LEETCODE - 147
// INSERTION SORT LIST

public class Q2{

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head.next;
        head.next = null;

        while(curr != null){
            ListNode next = curr.next;
            ListNode prev = dummy;

            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
            curr = next;

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

        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println("Before sorting:");
        printList(n1);

        ListNode sortedHead = insertionSortList(n1);

        System.out.println("After sorting:");
        printList(sortedHead);
    }
}