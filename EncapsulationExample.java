// This program demonstrates the concept of encapsulation in Java

// Define a class named Person with encapsulated fields
class Person {
    // Private fields - these can only be accessed within the Person class
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        // Adding validation logic in setter method
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person = new Person();

        // Set values using setter methods
        person.setName("Alice");
        person.setAge(25);

        // Get values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempt to set an invalid age
        person.setAge(-5); // This will display an error message
    }
}
