// HOUSE ROBBERY ---> DP QUESTION
// RECURSION + MEMORY

public class LeetCode198{

    public static int HouseRobbery(int[] nums){
        int n = nums.length;

        int[] dp = new int[n];

        dp[0] = nums[0];

        if(n == 1){
            return dp[0];
        }

        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(HouseRobbery(nums));

        int[] nums2 = {2,7,9,3,1};
        System.out.println(HouseRobbery(nums2));
    }
}