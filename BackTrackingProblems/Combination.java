// Leetcode - 77

import java.util.*;

public class Combination {
    public static void backTrack(int h, int n, int k, ArrayList<Integer> curr, List<List<Integer>> ans){
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i=h; i<=n; i++){
            curr.add(i);
            backTrack(i+1, n, k, curr, ans);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 4, k = 2;

        List<List<Integer>> ans = new ArrayList<>();
        backTrack(1, n, k, new ArrayList<>(), ans);
        System.out.println(ans);
    }
}
