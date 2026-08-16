// Q14. Find the sum of digits of a given number.
// Example:
// Input: 456
// Output: 15

import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
