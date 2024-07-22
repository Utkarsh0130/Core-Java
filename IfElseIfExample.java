// This program demonstrates the use of if-else if statements in Java

public class IfElseIfExample {
    public static void main(String[] args) {
        int score = 85;

        // Check the grade based on the score
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
