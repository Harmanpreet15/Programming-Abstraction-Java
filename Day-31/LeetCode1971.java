// 1971. Find if Path Exists in Graph

import java.util.ArrayList;

public class LeetCode1971 {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Build the undirected graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Step 3: Create visited array
        boolean[] visited = new boolean[n];

        // Step 4: Start DFS
        return dfs(source, destination, adj, visited);
    }

    public static boolean dfs(int node, int destination,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited) {

        // Destination reached
        if (node == destination) {
            return true;
        }

        visited[node] = true;

        // Visit all neighbours
        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {

                if (dfs(neighbour, destination, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;

        System.out.println(validPath(n, edges, source, destination));
    }
}
