public class MaxElement {
    public static void main(String[] args){
        int[] arr = {5, 2, 9, 6, 4, 8};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the arrray : " + max);
    }
}
