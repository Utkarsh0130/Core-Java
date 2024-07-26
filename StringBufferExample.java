// This program demonstrates the use of StringBuffer in Java

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Append strings
        sb.append(" World");
        System.out.println("Appended String: " + sb.toString());

        // Delete a portion of the string
        sb.delete(5, 7);
        System.out.println("String after deletion: " + sb.toString());

        // Replace a portion of the string
        sb.replace(5, 10, " Java");
        System.out.println("String after replacement: " + sb.toString());
    }
}
