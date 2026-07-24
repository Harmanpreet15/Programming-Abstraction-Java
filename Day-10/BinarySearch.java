public class BinarySearch {

    static int BS(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high-low) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 40;
        int ans = BS(arr, target);

        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Target element found at index : " + ans);
        }
    }
}
