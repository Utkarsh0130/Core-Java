// This program demonstrates the creation and use of multidimensional arrays in Java

public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print 2D array elements
        System.out.println("2D Array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
