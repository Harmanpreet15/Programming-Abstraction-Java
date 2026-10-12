import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        // Deque<Integer> dq = new ArrayDeque<>();

        // dq.addFirst(20);
        // System.out.println(dq);
        // dq.addFirst(10);
        // System.out.println(dq);
        // dq.addLast(30);
        // System.out.println(dq);
        // dq.addLast(40);
        // System.out.println(dq);
        // dq.removeFirst();
        // System.out.println(dq);
        // dq.removeLast();
        // System.out.println(dq);


        String s = "HELLO";
        Deque<Character> dq = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            dq.addFirst(s.charAt(i));
        }

        StringBuilder res = new StringBuilder();
        
        while(!dq.isEmpty()){
            res.append(dq.removeFirst());
        }

        System.out.println("Original : " + s);
        System.out.println("Reversed : " + res);

    }

}