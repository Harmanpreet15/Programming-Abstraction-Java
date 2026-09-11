// LEETCODE - 78
// Find all the subsets of an array

import  java.util.*;
  

public class subsets {

    static void generateSubsets(int[] nums, int index, ArrayList<Integer> current){
        if(index == nums.length){
            System.out.print(current + " ");
            return;
        }

        current.add(nums[index]);
        generateSubsets(nums, index+1, current);

        current.remove(current.size()-1);
        generateSubsets(nums, index+1, current);
        
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generateSubsets(nums, 0, new ArrayList<>());
    }
}
