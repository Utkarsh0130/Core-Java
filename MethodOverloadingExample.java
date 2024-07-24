// This program demonstrates the use of method overloading in Java

public class MethodOverloadingExample {
    // Method to calculate the area of a rectangle
    double calculateArea(double length, double width) {
        return length * width;
    }

    // Overloaded method to calculate the area of a square
    double calculateArea(double side) {
        return side * side;
    }

    // Overloaded method to calculate the area of a circle
    double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
        // Create an object of the MethodOverloadingExample class
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Call the overloaded methods and display the results
        System.out.println("Area of Rectangle: " + example.calculateArea(5.0, 3.0));
        System.out.println("Area of Square: " + example.calculateArea(4.0));
        System.out.println("Area of Circle: " + example.calculateArea(3.0, true));
    }
}
