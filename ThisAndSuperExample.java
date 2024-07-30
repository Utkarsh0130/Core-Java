// This program demonstrates the use of 'this' and 'super' keywords in Java

class Animal {
    String name;

    Animal(String name) {
        this.name = name; // 'this' refers to the current object's field
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // 'super' calls the constructor of the parent class
        this.breed = breed; // 'this' refers to the current object's field
    }

    void display() {
        super.display(); // 'super' calls the method of the parent class
        System.out.println("Breed: " + breed);
    }
}

public class ThisAndSuperExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.display();
    }
}
