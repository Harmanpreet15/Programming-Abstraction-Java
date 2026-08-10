// ==== Write a Program to swap two numbers ====
// Without using a third variable, Using arithmetic operators only

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers of your choice :");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("--AFTER SWAPPING--");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
