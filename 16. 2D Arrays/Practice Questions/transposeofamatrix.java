/*Question 3 :Write a program to Find Transpose of a Matrix.
What is Transpose? Transpose of a matrix is the process of swapping the rows to columns. 
For a 2x3 matrix,
Matrix
a11 a12 a13
a21 a22 a23
Transposed Matrix
a11 a21
a12 a22
a13 a23
*/ 

public class transposeofamatrix {
    public static void printMatrix(int matrix[][]) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    } 
    public static void transpose(int matrix[][]) {
        int row = 2, column = 3;
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3},
                        {4,5,6},};
        
        
        printMatrix(matrix);
        transpose(matrix);
        
    }
}
