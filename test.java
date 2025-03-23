// Import necessary libraries (if needed)
import java.util.Scanner; // Example import

// Declare a public class
public class MyProgram {

    // Main method - the entry point of any Java application
    public static void main(String[] args) {
        
        // Variables and statements go here
        System.out.println("Hello, World!");
        
        // Creating an instance of Scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "!");
    }
}
