// Q19. Division Calculator
// Write a Java program that takes two integers and performs division.
// Handle:
// ArithmeticException
// InputMismatchException
// Display meaningful error messages.


import java.util.*;

public class Ques19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter first num: ");
            int a = sc.nextInt();

            System.out.print("Enter second num: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);
        }

        catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.");
        }

        catch(InputMismatchException e){
            System.out.println("Error: Please enter int only.");
        }

        sc.close();

    }
}

