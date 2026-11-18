// Rotate matrix 90degree clockwise

// THERE ARE TWO APPROACHES:
// 1. Using an extra matrix
// 2. In-place rotation


// -------1. CLOCKWISE -> Using an extra matrix-----------
// public class rotateMatrix {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int n = matrix.length;
//         int[][] result = new int[n][n];

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 result[j][n-1-i] = matrix[i][j];
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }




// ------2.In-place rotation---------------

// 1. Transpose the matrix
// 2. Reverse each row

// public class rotateMatrix {
//     public static void rotate(int[][] matrix){
//         int n = matrix.length;

//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }

//         for(int i=0; i<n; i++){
//             int left = 0;
//             int right = n-1;

//             while(left < right){
//                 int temp = matrix[i][left];
//                 matrix[i][left] = matrix[i][right];
//                 matrix[i][right] = temp;

//                 left++;
//                 right--;
//             }
//         }
//     }
    
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         rotate(matrix);

//         for (int[] row : matrix) {
//             for (int num : row) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//         }
        
//     }
// }




// ---------------------------------------------------------------------------------------------------





// -------1. ANTICLOCKWISE -> Using an extra matrix-----------
// public class rotateMatrix {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         int n = matrix.length;
//         int[][] result = new int[n][n];

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 result[n-1-j][i] = matrix[i][j];
//             }
//         }

//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }




// ------2.In-place rotation---------------

// 1. Transpose the matrix
// 2. Reverse each row

public class rotateMatrix {
    public static void rotate(int[][] matrix){
        int n = matrix.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int j=0; j<n; j++){
            int top = 0;
            int bottom = n-1;

            while(top < bottom){
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;

                top++;
                bottom--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
    }
}
