
public class LeetCode346 {

    java.util.Queue<Integer> q = new java.util.LinkedList<>();
    int size;
    double sum = 0;

    public LeetCode346(int size) {
        this.size = size;
    }

    public double next(int val) {

        q.offer(val);
        sum += val;

        if (q.size() > size) {
            sum -= q.poll();
        }

        return sum / q.size();
    }

    public static void main(String[] args) {

        LeetCode346 obj = new LeetCode346(3);

        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}
