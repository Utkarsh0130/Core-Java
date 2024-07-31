// This program demonstrates the use of the 'final' keyword in Java

// final class cannot be extended
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// FinalClass cannot be extended
// class SubClass extends FinalClass {}

// class with final method
class Animal {
    // final method cannot be overridden
    final void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// subclass of Animal
class Dog extends Animal {
    // cannot override final method from Animal
    // void makeSound() {
    //     System.out.println("Dog barks.");
    // }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        final int constantValue = 100;
        // constantValue = 200; // Error: cannot assign a value to final variable

        System.out.println("Constant value: " + constantValue);

        FinalClass finalClass = new FinalClass();
        finalClass.display();
    }
}
