// This program demonstrates the use of a default constructor in Java

class Car {
    // Private fields
    private String model;
    private double price;

    // Default constructor
    Car() {
        model = "Unknown";
        price = 0.0;
    }

    // Method to display car details
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        // Create an object using the default constructor
        Car car1 = new Car();
        car1.display();
    }
}
