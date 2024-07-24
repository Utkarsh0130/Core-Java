
// This program demonstrates the use of heap memory in Java

// Define a class named Person
class Person {
    String name; // Instance variables are stored in heap memory
    int age;

    // Constructor to initialize the object
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class HeapMemoryExample {
    public static void main(String[] args) {
        // Objects are stored in heap memory
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // References to objects are stored in stack memory
        person1.displayDetails();
        person2.displayDetails();

        // Modify object properties
        person1.name = "Alice Smith";
        person1.age = 31;

        // Display modified details
        person1.displayDetails();
    }
}
