// Q18. Inheritance
// Create:
// Person
// Student
// Student should inherit Person and additionally store:
// Roll Number
// Course
// Display complete student details.


class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;
    String course;

    void displayStudent() {
        displayPerson();

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

public class Ques18 {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Harman";
        s.age = 20;
        s.rollNumber = 101;
        s.course = "CSE AIML";

        s.displayStudent();
    }
}

