// LeetCode 841 -> KEYS AND ROOMS

import java.util.*;

public class LeetCode841 {

    public static void dfs(int room, List<List<Integer>> rooms, boolean[] visited) {
        visited[room] = true;

        for (int key : rooms.get(room)) {
            if (!visited[key]) {
                dfs(key, rooms, visited);
            }
        }
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean[] visited = new boolean[n];

        dfs(0, rooms, visited);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        List<List<Integer>> rooms = new ArrayList<>();

        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(0));

        boolean result = canVisitAllRooms(rooms);

        System.out.println("Can visit all rooms: " + result);
    }
}
