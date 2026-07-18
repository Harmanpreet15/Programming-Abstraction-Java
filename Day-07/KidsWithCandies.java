import java.util.*;

// LeetCode Problem 1431

class KidsWithCandies{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int mx = candies[0];
        for (int num : candies) {
            mx = Math.max(num,mx);
        }
        for(int num:candies){
            if(num+extraCandies >= mx){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,8,3};
        System.out.println(kidsWithCandies(arr,3));
    }
}