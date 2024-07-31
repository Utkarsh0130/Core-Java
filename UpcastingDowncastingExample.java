// This program demonstrates upcasting and downcasting in Java

class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class UpcastingDowncastingExample {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog(); // Upcasting
        animal.eat();
        // animal.bark(); // Error: cannot find symbol

        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.bark();
        }
    }
}
