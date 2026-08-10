// ----------- Write a program to calculate electricity bill using the following conditions: --------------
// First 100 units → ₹5/unit
// Next 100 units → ₹7/unit
// Above 200 units → ₹10/unit


import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units : ");
        int units = sc.nextInt();
        int bill;

        if(units <= 100){
            bill = units * 5;
        } 
        else if(units <= 200){
            bill = (100 * 5) + ((units - 100) * 7);
        } 
        else{
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total Bill : " + bill);

        sc.close();
    }
}
