import java.util.*;

public class PrioQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(30);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}