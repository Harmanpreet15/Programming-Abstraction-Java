import java.util.Scanner;

// === Write a program to check whether a number is: ===
// Even or Odd, Negative, Positive or Zero

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of your choice : ");
        int a = sc.nextInt();

        if(a % 2 == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }


        if(a > 0){
            System.out.println("The number is Positive");
        }else if(a < 0){
            System.out.println("The number is Negative");
        }else{
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}
