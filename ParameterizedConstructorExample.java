// This program demonstrates the use of a parameterized constructor in Java

class Car {
    // Private fields
    private String model;
    private double price;

    // Parameterized constructor
    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Car car2 = new Car("Tesla Model S", 79999.99);
        car2.display();
    }
}
