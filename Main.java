import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        
        // Read the input as a String
        String name = scanner.nextLine();

        // Output the result
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner
        scanner.close();
    }
}

