// This program demonstrates the use of StringBuilder in Java

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append strings
        sb.append(" World");
        System.out.println("Appended String: " + sb.toString());

        // Insert a string at a specific index
        sb.insert(5, ",");
        System.out.println("String after insertion: " + sb.toString());

        // Reverse the string
        sb.reverse();
        System.out.println("Reversed String: " + sb.toString());
    }
}
