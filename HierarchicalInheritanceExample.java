// This program demonstrates hierarchical inheritance in Java

// Base class (Parent class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class 1 (Child class) extending the Animal class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Derived class 2 (Child class) extending the Animal class
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Create objects of the derived classes
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // Call methods of the base class and derived classes
        dog.eat();  // Method from Animal class
        dog.bark(); // Method from Dog class

        cat.eat();  // Method from Animal class
        cat.meow(); // Method from Cat class
    }
}
