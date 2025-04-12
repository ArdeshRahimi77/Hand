import java.util.Scanner;
import java.util.Random;

public class BeginnerChallenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Hello, World!
        System.out.println("Hello, World!");

        // 2. Sum of Two Numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));

        // 3. Even or Odd Checker
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");

        // 4. Simple Calculator
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        switch (operator) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': System.out.println(b != 0 ? "Result: " + (a / b) : "Cannot divide by zero"); break;
            default: System.out.println("Invalid operator");
        }

        // 5. Factorial Calculator
        System.out.print("Enter a number for factorial: ");
        int factNum = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= factNum; i++) factorial *= i;
        System.out.println("Factorial: " + factorial);

        // 6. Fibonacci Series
        System.out.print("Enter n for Fibonacci series: ");
        int n = scanner.nextInt();
        int f1 = 0, f2 = 1;
        System.out.print("Fibonacci: " + f1 + " " + f2);
        for (int i = 2; i < n; i++) {
            int next = f1 + f2;
            System.out.print(" " + next);
            f1 = f2;
            f2 = next;
        }
        System.out.println();

        // 7. Reverse a String
        System.out.print("Enter a string to reverse: ");
        scanner.nextLine();  // Consume the newline
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // 8. Palindrome Checker
        System.out.print("Enter a word to check palindrome: ");
        String word = scanner.next();
        System.out.println(word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()) ? "Palindrome" : "Not a palindrome");

        // 9. Multiplication Table
        System.out.print("Enter a number for multiplication table: ");
        int tableNum = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // 10. Guess the Number Game
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        int guess;
        System.out.println("Guess a number between 1 and 100:");
        do {
            guess = scanner.nextInt();
            if (guess < randomNum) System.out.println("Too low! Try again:");
            else if (guess > randomNum) System.out.println("Too high! Try again:");
        } while (guess != randomNum);
        System.out.println("Correct! You guessed the number!");

        scanner.close();
    }
}