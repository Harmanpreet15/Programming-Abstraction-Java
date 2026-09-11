// LEETCODE - 39

import java.util.*;

public class CombinationSum {

    public static void backTrack(int[] candidates, int target, int index, ArrayList<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i = index; i<candidates.length; i++){
            curr.add(candidates[i]);
            backTrack(candidates, target-candidates[i], i, curr, ans);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(candidates, target, 0, new ArrayList<>(), ans);
        System.out.println(ans);
    }
}
