// MERGE SORT --> DIVIDE AND CONQUER

import java.util.*;

public class LeetCode912 {

    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};

        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}