// This program demonstrates the use of stack memory in Java

public class StackMemoryExample {
    public static void main(String[] args) {
        // Primitive data types are stored in stack memory
        int a = 10;
        int b = 20;
        
        // Local variables (including references) are stored in stack memory
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b); // Note: values of a and b will not change because swap() is working on copies
    }

    // Method to swap two numbers
    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
