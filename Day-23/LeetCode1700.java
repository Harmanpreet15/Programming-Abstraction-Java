
public class LeetCode1700 {

    public static int countStudents(int[] students, int[] sandwiches) {

        java.util.Queue<Integer> q = new java.util.LinkedList<>();

        for (int student : students) {
            q.add(student);
        }

        int index = 0;
        int count = 0;

        while (!q.isEmpty()) {

            if (q.peek() == sandwiches[index]) {
                q.poll();
                index++;
                count = 0;
            } 
            else {
                q.add(q.poll());
                count++;
            }

            if (count == q.size()) {
                break;
            }
        }

        return q.size();
    }

    public static void main(String[] args) {

        int[] students = {1, 1, 0, 0};
        int[] sandwiches = {0, 1, 0, 1};

        System.out.println(countStudents(students, sandwiches));
    }
}