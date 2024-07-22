// This program demonstrates the use of the ternary operator in Java

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int number = 5;

        // Using ternary operator to check if number is even or odd
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result);
    }
}
