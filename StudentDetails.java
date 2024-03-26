package basicjava;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompting user for input
        System.out.println("Enter your full name with initial:");
        String fullName = scanner.nextLine();
        
        System.out.println("Enter your roll number:");
        String rollNumber = scanner.nextLine();
        
        System.out.println("Enter your grade:");
        String grade = scanner.nextLine();
        
        System.out.println("Enter your percentage:");
        String percentage = scanner.nextLine();
        
        // Printing the details
        System.out.println("Full name with initial: " + fullName);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage);
        
        // Closing the scanner
        scanner.close();
    }
}
