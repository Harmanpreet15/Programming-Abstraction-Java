import java.util.*;

public class PathExits {
    public static  boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        
        for(int []edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visited = new boolean[V];
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
        q.add(src);
        visited[src] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node == dest){
                return true;
            }
            for(int n: adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        
        return false;
     }

     public static void main(String[] args) {
        int V = 6;
        int edges[][] = {{0, 2}, {1, 2}, {0, 3}, {4, 5}};
        int src = 1;
        int dest = 5;

        System.out.println(checkPath(V, edges, src, dest));
     }

}