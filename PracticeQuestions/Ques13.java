// Q13. Print the Fibonacci Series up to N terms.
// Example:
// 0 1 1 2 3 5 8 13...

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
