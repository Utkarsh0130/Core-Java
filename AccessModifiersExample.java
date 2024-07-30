// This program demonstrates the use of access modifiers in Java

class Animal {
    public String name;      // Public access
    protected int age;       // Protected access
    private String species;  // Private access
    String color;            // Default access

    // Public method
    public void setSpecies(String species) {
        this.species = species;
    }

    // Private method
    private String getSpecies() {
        return species;
    }

    // Public method to access private method
    public void displaySpecies() {
        System.out.println("Species: " + getSpecies());
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Buddy";       // Public field
        animal.age = 5;              // Protected field
        animal.color = "Brown";      // Default field
        animal.setSpecies("Dog");    // Public method to set private field

        System.out.println("Name: " + animal.name);
        System.out.println("Age: " + animal.age);
        System.out.println("Color: " + animal.color);
        animal.displaySpecies();     // Accessing private method through public method
    }
}
