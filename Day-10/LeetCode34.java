public class LeetCode34 {
    public static int[] searchRange(int[] nums, int target) {
        int[]  ans = new int[2];
        int left = 0;
        int right =  nums.length-1;
        ans[0] = -1;
        ans[1] = -1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                ans[0] = mid;
                right = mid-1;
            }else if(target > nums[mid]){
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid] == target){
                ans[1] = mid;
                left = mid+1;
            }else if(target > nums[mid]){
                left = mid+1;
            }else{
                right = mid - 1;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println("First and Last position of the target element is : [" + ans[0] + ", " + ans[1] + "]");
    }
}