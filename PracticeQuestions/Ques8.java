// Q8. Write a Java program that displays grades based on percentage:
// 90+ → A+
// 80–89 → A
// 70–79 → B
// 60–69 → C
// Below 60 → Fail

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();

        if(percentage >= 90){
            System.out.println("Grade: A+");
        }else if(percentage >= 80) {
            System.out.println("Grade: A");
        }else if(percentage >= 70) {
            System.out.println("Grade: B");
        }else if(percentage >= 60) {
            System.out.println("Grade: C");
        }else{
            System.out.println("Fail");
        }

        sc.close();
    }
}
