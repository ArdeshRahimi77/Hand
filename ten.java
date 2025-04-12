public class ten {
    //simple calculator
    //import java.util.Scanner;

    /*public class SimpleCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
    
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
    
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
    
            double result = 0;
    
            if (operator == '+') result = num1 + num2;
            else if (operator == '-') result = num1 - num2;
            else if (operator == '*') result = num1 * num2;
            else if (operator == '/') result = num1 / num2;
    
            System.out.println("Result: " + result);*/
        }
    //To-Do list
    /*import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(scanner.nextLine());
            } else if (choice == 2) {
                for (String task : tasks) {
                    System.out.println(task);
                }
            } else if (choice == 3) {
                break;*/
//Number Guessing Game
/*import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;

        while (guess != numberToGuess) {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
        }

        System.out.println("You guessed it!");
    }
}
 */
//Grading Systen
/*import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student score: ");
        int score = scanner.nextInt();

        if (score >= 90) System.out.println("Grade: A");
        else if (score >= 80) System.out.println("Grade: B");
        else if (score >= 70) System.out.println("Grade: C");
        else System.out.println("Grade: D");
    }
}
 */
//Bank Account
/*import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

        System.out.println("Current balance: " + balance);
        System.out.print("Enter amount to deposit: ");
        double deposit = scanner.nextDouble();
        balance += deposit;

        System.out.println("New balance: " + balance);
    }
}
 */
//ATM
/*import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.0;

        System.out.println("Enter amount to withdraw: ");
        double withdraw = scanner.nextDouble();

        if (withdraw <= balance) {
            balance -= withdraw;
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
 */
//Prime Number
/*import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && num > 1) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}
 */
//Tic Tac Toe
/*import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        char currentPlayer = 'X';

        // Initialize empty board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Display empty board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // Take input for positions
        System.out.print("Enter row and column (0-2) for " + currentPlayer + ": ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        board[row][col] = currentPlayer;

        // Display the board again after move
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */
//Address Book
/*import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contacts = new ArrayList<>();

        while (true) {
            System.out.print("Enter contact name (or type 'exit' to quit): ");
            String contact = scanner.nextLine();

            if (contact.equals("exit")) {
                break;
            }

            contacts.add(contact);
            System.out.println("Contacts: " + contacts);
        }
    }
}
 */
//Unit Converter
/*import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble();

        double kilometers = meters / 1000;
        System.out.println(meters + " meters = " + kilometers + " kilometers");
    }
}
 */
            }
        }
    }
}

    }
    
}
