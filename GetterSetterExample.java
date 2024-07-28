// This program demonstrates the use of getter and setter methods in Java

class Student {
    // Private fields
    private String name;
    private int rollNumber;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter method for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student();
        
        // Set values using setter methods
        student.setName("John Doe");
        student.setRollNumber(123);
        
        // Get values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
    }
}
