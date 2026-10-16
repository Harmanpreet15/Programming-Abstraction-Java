import java.util.*;

public class LeetCode1046 {

    public static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            pq.offer(stone);
        }

        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();

            if(a != b){
                pq.offer(a-b);
            }
        }

        if(pq.isEmpty()){
            return 0;
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};

        System.out.println(lastStoneWeight(stones));
    }
}
