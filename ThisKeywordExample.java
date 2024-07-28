// This program demonstrates the use of 'this' keyword in Java

class Employee {
    // Private fields
    private String name;
    private double salary;

    // Constructor to initialize fields
    Employee(String name, double salary) {
        this.name = name; // 'this' keyword refers to the current object's field
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee emp = new Employee("Alice", 50000.0);
        
        // Display employee details
        emp.display();
    }
}
