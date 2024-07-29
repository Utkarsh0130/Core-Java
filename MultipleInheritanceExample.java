// This program demonstrates multiple inheritance using interfaces in Java

// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Class implementing both interfaces
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("The duck flies.");
    }

    public void swim() {
        System.out.println("The duck swims.");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the class implementing interfaces
        Duck duck = new Duck();
        
        // Call methods of the interfaces
        duck.fly();
        duck.swim();
    }
}
