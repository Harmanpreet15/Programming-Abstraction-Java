// Q15. Student Management System
// Create a Student class with:
// id
// name
// course
// marks
// Create methods:
// inputDetails()
// displayDetails()
// calculateGrade()


import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double marks;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();

        sc.close();
    }

    void calculateGrade() {
        if(marks >= 90)
            System.out.println("Grade: A");
        else if(marks >= 80)
            System.out.println("Grade: B");
        else if(marks >= 70)
            System.out.println("Grade: C");
        else if(marks >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: Fail");
    }

    void displayDetails() {
        System.out.println("\n======Student Details=====");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        calculateGrade();
    }
}

public class Ques15 {
    public static void main(String[] args) {
        Student s = new Student();

        s.inputDetails();
        s.displayDetails();
    }
}
