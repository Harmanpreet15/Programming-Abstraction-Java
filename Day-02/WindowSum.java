class WindowSum {
    public static void main(String[] args){
        
        int[] arr = {2,5,3,8,1,6};
        int k = 3;

        int maxSum = 0;
        int sum = 0;

        for(int i = 0;i<k;i++){
            sum+=arr[i];
        }

        for(int i = k;i<arr.length;i++){
            sum+=arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,sum);
        }

        System.out.println("Max sum of " + k + " consecutive elements is: " + maxSum);
    
        
    }

}