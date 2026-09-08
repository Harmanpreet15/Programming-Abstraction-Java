// LEETCODE - 86
// PARTITION LIST

public class Q6 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(0);
        ListNode bigDummy = new ListNode(0);

        ListNode small = smallDummy;
        ListNode big = bigDummy;
        ListNode curr = head;

        while (curr != null) {
            if(curr.val < x){
                small.next = curr;
                small = small.next;
            }else{
                big.next = curr;
                big = big.next;
            }
            curr = curr.next;
            
        }

        big.next = null;
        small.next = bigDummy.next;

        return  smallDummy.next;
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

        // 1 -> 4 -> 3 -> 2 -> 5 -> 2

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(2);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        int x = 3;

        System.out.println("Before:");
        printList(n1);

        ListNode result = partition(n1, x);

        System.out.println("After:");
        printList(result);
    }
}