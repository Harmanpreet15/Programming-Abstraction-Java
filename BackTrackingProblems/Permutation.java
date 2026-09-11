// LEETCODE - 46

import java.util.*;

public class Permutation {

    public static void permut(int[] nums, ArrayList<Integer> curr, boolean[] done, List<List<Integer>> ans){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(done[i]){
                continue;
            }

            curr.add(nums[i]);
            done[i] = true;
            permut(nums, curr, done, ans);

            curr.remove(curr.size()-1);
            done[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] done = new boolean[nums.length];
        permut(nums, new ArrayList<>(), done, ans);
        System.out.println(ans);
    }
}
