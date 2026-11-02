import java.util.*;;

// public class LeetCode973 {
//     public static int[][] kClosest(int[][] points, int k){
//         Arrays.sort(points, (a, b) -> {
//             int d1 = a[0]*a[0] + a[1]*a[1];
//             int d2 = b[0]*b[0] + b[1]*b[1];

//             return Integer.compare(d1, d2);
//         });

//         return Arrays.copyOfRange(points, 0, k);
//     }
    
//     public static void main(String[] args) {
//         int[][] points = {{1,3},{-2,2}};
//         int k = 1;

//         System.out.println(Arrays.deepToString(kClosest(points, k)));
//     }
// }



public class LeetCode973 {
    public static int[][] kClosest(int[][] points, int k){
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0]*b[0]+b[1]*b[1], a[0]*a[0]+a[1]*a[1])
        );

        for(int[] point : points){
            pq.offer(point);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[][] res = new int[k][2];

        for(int i=0; i<k; i++){
            res[i] = pq.poll();
        }

        return res;
    }
    
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;

        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }
}