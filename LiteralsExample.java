// This program demonstrates the use of literals in Java

public class LiteralsExample {
    public static void main(String[] args) {
        // Integer literal
        int decimalLiteral = 100;
        int octalLiteral = 0144; // Octal (base 8)
        int hexLiteral = 0x64;   // Hexadecimal (base 16)

        System.out.println("Decimal Literal: " + decimalLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Hex Literal: " + hexLiteral);

        // Floating point literal
        double pi = 3.14159;
        System.out.println("Floating Point Literal: " + pi);

        // Character literal
        char letter = 'A';
        System.out.println("Character Literal: " + letter);

        // String literal
        String message = "Hello, Java!";
        System.out.println("String Literal: " + message);

        // Boolean literal
        boolean isJavaFun = true;
        System.out.println("Boolean Literal: " + isJavaFun);
    }
}
