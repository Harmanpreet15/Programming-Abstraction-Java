import java.util.*;

public class LeetCode649 {
    public static String predictPartyVictory(String senate) {
        java.util.Queue<Integer> radiant = new java.util.LinkedList<>();
        java.util.Queue<Integer> dire = new java.util.LinkedList<>();

        int n = senate.length();

        for(int i=0; i<n; i++){
            if(senate.charAt(i) == 'R'){
                radiant.offer(i);
            }else{
                dire.offer(i);
            }
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int r = radiant.poll();
            int d = dire.poll();

            if(r < d){
                radiant.offer(r+n);
            }else{
                dire.offer(d+n);
            }
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter senate string: ");
        String senate = sc.nextLine();

        String result = predictPartyVictory(senate);

        System.out.println("Winner: " + result);

        sc.close();
    }
}

