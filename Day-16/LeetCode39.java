// ------------return a list of all unique combinations of candidates where the chosen numbers sum to target--------------

import java.util.ArrayList;
import java.util.List;

public class LeetCode39 {

    public static void backTrack(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
        }

        if(target < 0){
            return;
        }

        for(int i= index; i<candidates.length; i++){
            current.add(candidates[i]);

            backTrack(i, candidates, target-candidates[i], current, result);

            current.remove(current.size()-1);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

}
