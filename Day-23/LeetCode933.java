
public class LeetCode933 {

    public static int ping(int t, java.util.Queue<Integer> q) {

        // Add current call
        q.add(t);

        // Remove calls older than 3000 ms
        while (q.peek() < t - 3000) {
            q.poll();
        }

        // Number of calls in the last 3000 ms
        return q.size();
    }

    public static void main(String[] args) {

        java.util.Queue<Integer> q = new java.util.LinkedList<>();

        System.out.println(ping(1, q));
        System.out.println(ping(100, q));
        System.out.println(ping(3001, q));
        System.out.println(ping(3002, q));
    }
}