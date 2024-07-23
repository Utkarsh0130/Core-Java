// This program demonstrates the use of nested loops in Java

public class NestedLoopsExample {
    public static void main(String[] args) {
        // Using nested for loops to print a multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t"); // Print product of i and j
            }
            System.out.println(); // Move to the next line after each row
        }

        // Using nested while loops to print a pattern
        System.out.println("\nPattern:");
        int rows = 5;
        int i = 1;

        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* "); // Print star
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }

        // Using nested do-while loops to print another pattern
        System.out.println("\nAnother Pattern:");
        i = 1;

        do {
            int j = 1;
            do {
                System.out.print(j + " "); // Print number
                j++;
            } while (j <= i);
            System.out.println(); // Move to the next line after each row
            i++;
        } while (i <= rows);
    }
}
