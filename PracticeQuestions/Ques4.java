// ==== Write a program that takes marks of 5 subjects and calculates: ====
// Total Marks, Percentage and Average

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();

        int totalM = s1 + s2 + s3 + s4 + s5;
        double percentage = (totalM / 500.0) * 100;
        double average = totalM / 5.0;

        System.out.println("Total Marks = " + totalM);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Average = " + average);

        sc.close();
    }
}
