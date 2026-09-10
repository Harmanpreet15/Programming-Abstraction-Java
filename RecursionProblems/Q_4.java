// Reverse an array using recursion

public class Q_4 {
    public static void Reverse(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        Reverse(arr, left + 1, right-1);
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Reverse(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
