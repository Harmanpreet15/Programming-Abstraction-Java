// -------------------Q22. Check whether a number is an Armstrong Number.------------------

import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int temp = num;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, digits);
            temp = temp / 10;
        }

        if(sum == original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
