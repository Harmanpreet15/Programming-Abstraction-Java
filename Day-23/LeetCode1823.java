
class LeetCode1823 {
    public static int findTheWinner(int n, int k) {

        java.util.Queue<Integer> q = new java.util.LinkedList<>();

        for(int i=1; i<=n; i++){
            q.add(i);
        }

        while(q.size() != 1){
            for(int i=1; i<k; i++){
                q.add(q.poll());
            }
            q.poll();
        }

        return q.peek();
    }

    public static void main(String[] args) {
        int n = 6, k = 5;
        System.out.println(findTheWinner(n, k));
    }
}