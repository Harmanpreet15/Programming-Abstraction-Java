// Sum f a array using recursion

public class Q_3 {

    public static int arraySum(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }

        return arr[index] + arraySum(arr, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 2, 1, 3};
        int index = 0;

        System.out.println(arraySum(arr, index));
    }
}
