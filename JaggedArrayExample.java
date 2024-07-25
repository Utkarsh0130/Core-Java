// This program demonstrates the creation and use of jagged arrays in Java

public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a jagged array of integers
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        // Access and print jagged array elements
        System.out.println("Jagged Array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
