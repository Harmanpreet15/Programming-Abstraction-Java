import java.util.*;

public class LeetCode502{

    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital){
        int n = profits.length;
        int[][] project = new int[n][2];

        for(int i=0; i<n; i++){
            project[i][0] = capital[i];
            project[i][1] = profits[i];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int i=0;
        for(int j=0; j<k; j++){
            while(i<n && project[i][0]<=w){
                pq.offer(project[i][1]);
                i++;
            }

            if(pq.isEmpty()){
                break;
            }

            w += pq.poll();
        }

        return w;

    }
    public static void main(String[] args) {
        int k=2, w=0;
        int[] profits = {1, 2, 3};
        int[] capital = {0, 1, 1};

        System.out.println(findMaximizedCapital(k, w, profits, capital));
    }
}