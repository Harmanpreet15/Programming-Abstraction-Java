import java.util.*;

//Leetcode problem 54

class SpiralMatrix{
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0,bottom = m-1,left = 0,right = n-1;
        List<Integer> al = new ArrayList<>();
        while(top<=bottom && left<=right){
            
            int i=top,j=left; //going right
            while(j<=right){
                al.add(matrix[i][j]);
                j++;
            }
            top++;
            
            i = top; //moving down
            j=right;
            while(i<=bottom){
                al.add(matrix[i][j]);
                i++;
            }
            right--;

            if (top <= bottom) {
                i = bottom;
                j=right;
                while(j>=left){ //movinf left
                    al.add(matrix[i][j]);
                    j--;
                }
                bottom--;
            }

            if(left<=right){
                i=bottom;
                j=left;
                while(i>=top){  //moving up
                    al.add(matrix[i][j]);
                    i--;
                }
                left++;
            }
            
        }
        return al;
    }
    public static void main(String[] args){
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println(spiralOrder(matrix));
    }
}