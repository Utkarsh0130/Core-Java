// This program demonstrates the use of static blocks in Java

class StaticBlock {
    // Static variable
    static int num;

    // Static block to initialize the static variable
    static {
        num = 100;
        System.out.println("Static block executed. Num initialized to " + num);
    }

    // Constructor
    StaticBlock() {
        System.out.println("Constructor executed.");
    }

    // Static method to display the value of num
    static void displayNum() {
        System.out.println("Value of num: " + num);
    }
}

public class StaticBlockExample {
    public static void main(String[] args) {
        // Display the value of num using static method
        StaticBlock.displayNum();

        // Create an object of StaticBlock class
        StaticBlock obj = new StaticBlock();
    }
}
