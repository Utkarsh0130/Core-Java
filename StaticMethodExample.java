// This program demonstrates the use of static methods in Java

class MathOperations {
    // Static method to calculate the square of a number
    static int square(int x) {
        return x * x;
    }

    // Static method to calculate the cube of a number
    static int cube(int x) {
        return x * x * x;
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        // Call static methods without creating an object
        int number = 5;
        System.out.println("Square of " + number + ": " + MathOperations.square(number));
        System.out.println("Cube of " + number + ": " + MathOperations.cube(number));
    }
}
