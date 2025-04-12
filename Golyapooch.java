import java.util.Random;
import java.util.Scanner;

public class Golyapooch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean Gol = random.nextBoolean(); // Randomly determines Gol (true) or Pooch (false)

        System.out.print("Player1, Gol ya Pooch? ");
        String player1 = scanner.nextLine();

        System.out.print("Player2, Gol ya Pooch? ");
        String player2 = scanner.nextLine();

        // Determine the result
        String result = Gol ? "Gol" : "Pooch";
        System.out.println("Result: " + result);

        // Check Player1's guess
        if (player1.equalsIgnoreCase(result)) {
            System.out.println("Player1 guessed correctly!");
        } else {
            System.out.println("Player1 guessed wrong.");
        }

        // Check Player2's guess
        if (player2.equalsIgnoreCase(result)) {
            System.out.println("Player2 guessed correctly!");
        } else {
            System.out.println("Player2 guessed wrong.");
        }

        scanner.close();
    }
}

