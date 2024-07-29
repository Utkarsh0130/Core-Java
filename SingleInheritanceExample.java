// This program demonstrates single inheritance in Java

// Base class (Parent class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Child class) extending the Animal class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog dog = new Dog();
        
        // Call methods of both the base class and derived class
        dog.eat();  // Method from Animal class
        dog.bark(); // Method from Dog class
    }
}
