// LeetCode - 51
// N Queen Problem

import java.util.*;

public class NQueens {

    public static void backTrack(char[][] board, int row, List<List<String>> result){
        if(row == board.length){
            result.add(createBoard(board));
            return;
        }

        for(int col = 0; col<board.length; col++){
            if(!isSafe(board, row, col)){
                continue;
            }

            board[row][col] = 'Q';
            backTrack(board, row+1, result);
            board[row][col] = '.';
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        int i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }

        i = row-1;
        j = col+1;

        while(i>=0 && j<board.length){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public static List<String> createBoard(char[][] board){
        List<String> result = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            result.add(new String(board[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        backTrack(board, 0, result);

        System.out.println(result);
    }
}
