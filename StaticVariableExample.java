// This program demonstrates the use of static variables in Java

class Counter {
    // Static variable to count the number of objects created
    static int count = 0;

    // Constructor to increment the static variable
    Counter() {
        count++;
    }

    // Method to display the count
    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        // Create objects of Counter class
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        // Display the count using one of the objects
        obj1.displayCount(); // Output will be 3 for all objects
    }
}
