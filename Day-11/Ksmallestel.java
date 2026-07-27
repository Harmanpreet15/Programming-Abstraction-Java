import java.util.Arrays;

public class Ksmallestel {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 1, 5, 2};
        int k = 3;
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.print(k + "rd Smallest element in the array : " + arr[k-1]);
    }
}
