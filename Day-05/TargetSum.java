// ----------- Two pointer approach ----------------


public class TargetSum{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,7,10,11,15};
        int target = 15;

        int left = 0;
        int right = arr.length-1;
        boolean found=false;

        while(left<right){
            int current_sum = arr[left] + arr[right];
            if(current_sum == target){
                System.out.println("(" + left + "," + right + ")");
                found = true;
                break;
            }

            else if(current_sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        if(!found) System.out.println("Not found");
    }
}