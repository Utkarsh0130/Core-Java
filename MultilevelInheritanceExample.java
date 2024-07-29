// This program demonstrates multilevel inheritance in Java

// Base class (Parent class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class (Child of Animal and Parent of Dog)
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Derived class (Child class) extending the Mammal class
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog dog = new Dog();
        
        // Call methods of all the classes in the hierarchy
        dog.eat();  // Method from Animal class
        dog.walk(); // Method from Mammal class
        dog.bark(); // Method from Dog class
    }
}
