import java.util.*;;

public class LeetCode973 {
    public static int[][] kClosest(int[][] points, int k){
        Arrays.sort(points, (a, b) -> {
            int d1 = a[0]*a[0] + a[1]*a[1];
            int d2 = b[0]*b[0] + b[1]*b[1];

            return Integer.compare(d1, d2);
        });

        return Arrays.copyOfRange(points, 0, k);
    }
    
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;

        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }
}
