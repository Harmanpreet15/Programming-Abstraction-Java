import java.util.*;

public class Bfs {
    public static ArrayList<Integer> BFS(boolean[] visited, 
        java.util.Queue<Integer> q,
        int root,
        ArrayList<Integer> list,
        ArrayList<ArrayList<Integer>> adj){

        visited[root] = true;
        q.add(root);

        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);

            for(int x : adj.get(node)){
                if(!visited[x]){
                    q.add(x);
                    visited[x] = true;
                }
            }
            
        }
        return list;
    }
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();

        boolean []visited = new boolean[V];
        java.util.Queue<Integer> res = new java.util.LinkedList<>();

        ArrayList<Integer> list = new ArrayList<>();
        BFS(visited,res,0,list,adj);
        return list;
        
    }

    public static void main(String[] args) {
        int adj[][] = {{2, 3, 1}, {0}, {0, 4}, {0}, {2}};
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();

        for (int i = 0; i < adj.length; i++) {

            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < adj[i].length; j++) {
                temp.add(adj[i][j]);
            }

            x.add(temp);
        }
        System.out.println(bfs(x));
    }
}