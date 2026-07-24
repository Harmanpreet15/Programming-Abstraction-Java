class LinearSearch{

    static int LSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 40, 90};
        int target = 30;
        int ans = LSearch(arr, target);

        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : " + ans);
        }
    }
}