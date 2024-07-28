// This program demonstrates the use of anonymous objects in Java

class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }
}

public class AnonymousObjectExample {
    public static void main(String[] args) {
        // Using an anonymous object to call the add method
        int sum = new Calculator().add(10, 20);
        System.out.println("Sum: " + sum);

        // Using an anonymous object to call the subtract method
        int difference = new Calculator().subtract(30, 10);
        System.out.println("Difference: " + difference);
    }
}
