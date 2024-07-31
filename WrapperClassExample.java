// This program demonstrates the use of wrapper classes in Java

public class WrapperClassExample {
    public static void main(String[] args) {
        // Primitive types
        int primitiveInt = 10;
        double primitiveDouble = 20.5;

        // Wrapper classes
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing
        Double wrapperDouble = Double.valueOf(primitiveDouble); // Boxing

        // Unboxing
        int unboxedInt = wrapperInt.intValue();
        double unboxedDouble = wrapperDouble.doubleValue();

        // Autoboxing
        Integer autoBoxedInt = primitiveInt;
        Double autoBoxedDouble = primitiveDouble;

        // Auto-unboxing
        int autoUnboxedInt = autoBoxedInt;
        double autoUnboxedDouble = autoBoxedDouble;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Unboxed double: " + unboxedDouble);
        System.out.println("Auto-boxed Double: " + autoBoxedDouble);
        System.out.println("Auto-unboxed double: " + autoUnboxedDouble);
    }
}
