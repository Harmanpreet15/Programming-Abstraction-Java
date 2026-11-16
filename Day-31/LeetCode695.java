// MAX AREA OF ISLAND

public class LeetCode695 {
    public static int dfs(int[][] grid, int row, int col){
        int m = grid.length-1;
        int n = grid[0].length-1;

        int area = 1;

        if(row < 0 || col < 0 || row > m || col > n || grid[row][col] == 0){
            return 0;
        }

        grid[row][col] = 0;

        area += dfs(grid, row-1, col);
        area += dfs(grid, row+1, col);
        area += dfs(grid, row, col-1);
        area += dfs(grid, row, col+1);

        return area;
    }

    public static int MaxAreaOfIsland(int[][] grid){
        int area = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    area = Math.max(area, dfs(grid, i, j));
                }
            }
        }

        return area;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println(MaxAreaOfIsland(grid));
    }
}