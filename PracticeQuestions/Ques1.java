// ==== Write a java program to input two numbers and print: ====
// Sum, Difference, Product, Quotient, Remainder

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers of your choice: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        int quot = a/b;
        int rem = a%b;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + diff);
        System.out.println("Product : " + prod);
        System.out.println("Quotient : " + quot);
        System.out.println("Remainder : " + rem);

        sc.close();
        
    }
}
