import java.util.*;

public class LeetCode347 {
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freq.get(a) - freq.get(b));

        for(int num : freq.keySet()){
            pq.offer(num);

            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] res = new int[k];

        for(int i=0; i<k; i++){
            res[i] = pq.poll();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] res = topKFrequent(nums, k);
        System.out.println(Arrays.toString(res));
    }
}
