// Q11. Reverse a given number.
// Example:
// Input: 12345
// Output: 54321

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse = " + reverse);

        sc.close();
    }
}
