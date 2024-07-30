// This program demonstrates polymorphism and dynamic method dispatch in Java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal; // Reference of type Animal

        // Dynamic method dispatch
        animal = new Dog();
        animal.sound(); // Calls Dog's sound method

        animal = new Cat();
        animal.sound(); // Calls Cat's sound method
    }
}
