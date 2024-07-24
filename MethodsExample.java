// This program demonstrates the use of methods in Java

public class MethodsExample {
    // Method to calculate the sum of two integers
    int calculateSum(int a, int b) {
        return a + b;
    }

    // Method to display a message
    void displayMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Create an object of the MethodsExample class
        MethodsExample example = new MethodsExample();

        // Call the calculateSum method and store the result
        int sum = example.calculateSum(10, 20);

        // Call the displayMessage method to display the result
        example.displayMessage("The sum is: " + sum);
    }
}
