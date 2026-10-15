
import java.util.*;

public class LeetCode23 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode s = pq.poll();

            tail.next = s;
            tail = tail.next;

            if (s.next != null) {
                pq.offer(s.next);
            }
        }

        return dummy.next;
    }

    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (int num : arr) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] lists = {
            {1, 4, 5},
            {1, 3, 4},
            {2, 6}
        };

        ListNode[] linkedLists = new ListNode[lists.length];

        for (int i = 0; i < lists.length; i++) {
            linkedLists[i] = createList(lists[i]);
        }

        ListNode result = mergeKLists(linkedLists);

        printList(result);
    }
}
