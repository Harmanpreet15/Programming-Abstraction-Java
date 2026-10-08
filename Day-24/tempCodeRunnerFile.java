
class MovingAverage {

    java.util.Queue<Integer> q;
    int size;
    double sum;

    public MovingAverage(int size) {
        this.size = size;
        q = new java.util.LinkedList<>();
        sum = 0;
    }

    public double next(int val) {

        q.add(val);
        sum += val;

        if (q.size() > size) {
            sum -= q.remove();
        }

        return sum / q.size();
    }
}

public class LeetCode346 {

    public static void main(String[] args) {

        MovingAverage obj = new MovingAverage(3);

        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}