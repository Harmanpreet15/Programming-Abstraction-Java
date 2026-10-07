
public class LeetCode2073 {

    public static int timeRequiredToBuy(int[] tickets, int k){
        java.util.Queue<Integer> q = new java.util.LinkedList<>();

        for(int i=0; i<tickets.length; i++){
            q.add(i);
        }

        int time = 0;

        while(tickets[k] > 0){
            int person = q.poll();
            tickets[person]--;
            time++;

            if(tickets[person] > 0){
                q.add(person);
            }
        }

        return time;
    }
    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        int k = 2;

        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
