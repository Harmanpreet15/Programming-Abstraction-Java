// Prime number

public class Problem4 {
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }

        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            if(isPrime(i)){
                System.out.println(i + " is Prime Number");
            }else{
                System.out.println(i + " is not a prime number");
            }
        }
    }
}
