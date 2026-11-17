public class LeetCode130 {

    public static void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {

            if (board[i][0] == 'O') {
                dfs(board, i, 0, m, n);
            }

            if (board[i][n - 1] == 'O') {
                dfs(board, i, n - 1, m, n);
            }
        }

        for (int j = 0; j < n; j++) {

            if (board[0][j] == 'O') {
                dfs(board, 0, j, m, n);
            }

            if (board[m - 1][j] == 'O') {
                dfs(board, m - 1, j, m, n);
            }
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    public static void dfs(char[][] board, int row, int col, int m, int n) {

        if (row < 0 || col < 0 || row >= m || col >= n ||
            board[row][col] != 'O') {
            return;
        }

        board[row][col] = '#';

        dfs(board, row - 1, col, m, n);
        dfs(board, row + 1, col, m, n);
        dfs(board, row, col - 1, m, n);
        dfs(board, row, col + 1, m, n);
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        System.out.println("Original Board:");

        printBoard(board);

        solve(board);

        System.out.println("\nFinal Board:");

        printBoard(board);
    }

    public static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
