public class Problem10 {
    public static void main(String[] args) {
        int num = 121;

        int orig = num;
        int rev = 0;

        while(num > 0){
            int d = num % 10;
            rev = rev*10 + d;
            num = num / 10;
        }

        if(orig == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}


// 1122334455 -> 1 2times, 2 2times, 


// * * * * *
// * * * *
// * * *
// * * *
// * * * *
// * * * * *