// This program demonstrates the use of nested ternary operators in Java

public class NestedTernaryOperatorExample {
    public static void main(String[] args) {
        int number = 15;

        // Using nested ternary operator to check if number is positive, negative, or zero
        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(number + " is " + result);

        // Another example: Check if a number is even or odd and greater than 10 or not
        String result2 = (number % 2 == 0) ? (number > 10 ? "even and greater than 10" : "even and not greater than 10")
                                          : (number > 10 ? "odd and greater than 10" : "odd and not greater than 10");
        System.out.println(number + " is " + result2);
    }
}
