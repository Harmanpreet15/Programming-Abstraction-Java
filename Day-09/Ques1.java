class Ques1{
    public static int SmallestSubarray(int[] arr, int k){
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right=0; right<arr.length; right++){
            sum += arr[right];

            while(sum >= k){
                minLength = Math.min(minLength, right-left+1);
                sum -= arr[left];
                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE)
        return 0;
        return minLength;
    }

    public static void main(String[] args){
        int[] arr = {2,3,1,2,4,3};
        int k = 7;
        int ans = SmallestSubarray(arr, k);
        System.out.println("Minimum length : " + ans);
    }
}