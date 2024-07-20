// This program demonstrates the use of relational operators in Java

public class RelationalOperatorsExample {
    public static void main(String[] args) {
        // Declare variables
        int num1 = 10;
        int num2 = 5;

        // Equal to
        boolean isEqual = (num1 == num2);
        System.out.println(num1 + " == " + num2 + " : " + isEqual);

        // Not equal to
        boolean isNotEqual = (num1 != num2);
        System.out.println(num1 + " != " + num2 + " : " + isNotEqual);

        // Greater than
        boolean isGreater = (num1 > num2);
        System.out.println(num1 + " > " + num2 + " : " + isGreater);

        // Less than
        boolean isLess = (num1 < num2);
        System.out.println(num1 + " < " + num2 + " : " + isLess);

        // Greater than or equal to
        boolean isGreaterOrEqual = (num1 >= num2);
        System.out.println(num1 + " >= " + num2 + " : " + isGreaterOrEqual);

        // Less than or equal to
        boolean isLessOrEqual = (num1 <= num2);
        System.out.println(num1 + " <= " + num2 + " : " + isLessOrEqual);
    }
}
