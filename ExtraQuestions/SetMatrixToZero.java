// ------------If you found zero convert its entire row and col to zero---------

public class SetMatrixToZero {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6}, 
            {7, 8, 9}
        };

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m]; 
        boolean[] col = new boolean[n]; 

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
