

public class Problem6 {
    public static void main(String[] args) {
        int n = 12345;

        int res = 0;

        while(n>0){
            int digit = n%10;
            res = res*10 + digit;
            n = n/10;
        }

        System.out.println(res);
    }
}
