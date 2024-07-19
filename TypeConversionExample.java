// This program demonstrates type conversion in Java

public class TypeConversionExample {
    public static void main(String[] args) {
        // Implicit type conversion (widening conversion)
        int integerNumber = 100;
        double doubleNumber = integerNumber; // int to double
        System.out.println("Implicit Conversion (int to double): " + doubleNumber);

        // Explicit type conversion (narrowing conversion)
        double pi = 3.14159;
        int truncatedPi = (int) pi; // double to int
        System.out.println("Explicit Conversion (double to int): " + truncatedPi);

        // String to integer conversion
        String numberString = "123";
        int parsedNumber = Integer.parseInt(numberString);
        System.out.println("String to Integer Conversion: " + parsedNumber);

        // Integer to string conversion
        int anotherNumber = 456;
        String numberString2 = Integer.toString(anotherNumber);
        System.out.println("Integer to String Conversion: " + numberString2);
    }
}
