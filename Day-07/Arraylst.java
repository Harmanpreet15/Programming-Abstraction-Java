import java.util.ArrayList;;

public class Arraylst{
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();

        students.add("Neeraj");
        students.add("Vikas");
        students.add("Ashish");
        students.add("Dhruv");

        System.out.println("Original List : ");
        System.out.println(students);

        students.add(2, "Vishal");
        System.out.println(students);

        students.set(2, "Vihaan");
        System.out.println(students);

        students.remove("Vihan");
        System.out.println(students);

        System.out.println("Contains Vikas : " + students.contains("Vikas"));

        for(String name : students){
            System.out.println(name + " ");
        }
    }
}