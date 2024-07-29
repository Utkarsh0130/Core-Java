// This program demonstrates a simulation of hybrid inheritance in Java using classes

// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class 1 from Animal (Single Inheritance)
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Derived class 2 from Animal (Hierarchical Inheritance)
class Bird extends Animal {
    void fly() {
        System.out.println("This bird flies.");
    }
}

// Derived class from Mammal (Multilevel Inheritance)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Another derived class from Mammal (Hierarchical Inheritance)
class Cat extends Mammal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HybridInheritanceExampleWithoutInterfaces {
    public static void main(String[] args) {
        // Create objects of derived classes

        // Dog class (Single + Multilevel Inheritance)
        Dog dog = new Dog();
        dog.eat();   // Method from Animal class
        dog.walk();  // Method from Mammal class
        dog.bark();  // Method from Dog class

        // Cat class (Single + Hierarchical Inheritance)
        Cat cat = new Cat();
        cat.eat();   // Method from Animal class
        cat.walk();  // Method from Mammal class
        cat.meow();  // Method from Cat class

        // Bird class (Single + Hierarchical Inheritance)
        Bird bird = new Bird();
        bird.eat();  // Method from Animal class
        bird.fly();  // Method from Bird class
    }
}
