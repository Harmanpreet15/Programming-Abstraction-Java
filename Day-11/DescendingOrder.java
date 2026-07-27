import java.util.Arrays;

public class DescendingOrder {
    public static void BubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={5, 8, 2, 4, 6, 7, 3, 9};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
