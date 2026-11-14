// FIND NUMBER OF PROVINCES...


public class LeetCode547{

    static void dfs(int city, int[][] isConnected, boolean[] visited){
        visited[city] = true;

        for(int n=0; n<isConnected.length; n++){
            if(isConnected[city][n] ==1 && !visited[n]){
                dfs(n, isConnected, visited);
            }
        }
    }

    public static int findCircleNum(int[][] isConnected){
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int p = 0;
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                p++;
                dfs(i, isConnected, visited);
            }
        }

        return p;
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(isConnected));
    }
}