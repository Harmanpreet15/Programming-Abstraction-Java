// Q17. Employee Salary System
// Create an Employee class with:
// id
// name
// basicSalary
// Methods:
// calculateHRA()
// calculateDA()
// calculateGrossSalary()


class Employee{
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateHRA(){
        return basicSalary*0.20;
    }

    double calculateDA(){
        return basicSalary*0.10;
    }

    double calculateGrossSalary(){
        return basicSalary + calculateHRA() + calculateDA();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + calculateHRA());
        System.out.println("DA: " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class Ques17 {
    public static void main(String[] args) {

        Employee e = new Employee(101, "Harman", 50000);
        e.display();
    }
}
