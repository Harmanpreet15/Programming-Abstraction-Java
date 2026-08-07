public class LeetCode70 {
    public static int climbStairs(int n){
        if(n==1) return 1;

        if(n==2) return 2;
        
        int first = 1;
        int second = 2;

        for(int i=3; i<=n; i++){
            int current = first + second;
            first = second;
            second = current;
        }

        return second;

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }
}
