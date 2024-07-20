// This program demonstrates the use of logical operators in Java

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        // Declare variables
        boolean value1 = true;
        boolean value2 = false;

        // Logical AND
        boolean andResult = value1 && value2;
        System.out.println(value1 + " && " + value2 + " : " + andResult);

        // Logical OR
        boolean orResult = value1 || value2;
        System.out.println(value1 + " || " + value2 + " : " + orResult);

        // Logical NOT
        boolean notResult = !value1;
        System.out.println("!" + value1 + " : " + notResult);

        // Combining logical operators
        boolean combinedResult = (value1 && value2) || (!value1 && value2);
        System.out.println("(" + value1 + " && " + value2 + ") || (!" + value1 + " && " + value2 + ") : " + combinedResult);
    }
}
