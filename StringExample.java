// This program demonstrates the use of String in Java

public class StringExample {
    public static void main(String[] args) {
        // String literals
        String str1 = "Hello";
        String str2 = "World";
        
        // String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // String methods
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Character at index 1: " + str3.charAt(1));
        System.out.println("Substring from index 6: " + str3.substring(6));
        System.out.println("Uppercase: " + str3.toUpperCase());
    }
}
