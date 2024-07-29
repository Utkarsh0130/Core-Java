// This program demonstrates hybrid inheritance using interfaces in Java

// Base interface 1
interface Animal {
    void eat();
}

// Base interface 2
interface Mammal {
    void walk();
}

// Derived class implementing both interfaces
class Dog implements Animal, Mammal {
    public void eat() {
        System.out.println("The dog eats.");
    }

    public void walk() {
        System.out.println("The dog walks.");
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}

// Another derived class implementing only one interface
class Cat implements Animal {
    public void eat() {
        System.out.println("The cat eats.");
    }

    void meow() {
        System.out.println("The cat meows.");
    }
}

// Derived class from Dog demonstrating hierarchical inheritance
class Labrador extends Dog {
    void display() {
        System.out.println("This is a Labrador.");
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Labrador class
        Labrador labrador = new Labrador();
        
        // Call methods of Labrador class
        labrador.eat();   // Method from Animal interface
        labrador.walk();  // Method from Mammal interface
        labrador.bark();  // Method from Dog class
        labrador.display(); // Method from Labrador class

        // Create an object of the Cat class
        Cat cat = new Cat();
        
        // Call methods of Cat class
        cat.eat();  // Method from Animal interface
        cat.meow(); // Method from Cat class
    }
}
