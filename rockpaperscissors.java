/*import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove = rps[random.nextInt(rps.length)];
        
        System.out.println("Enter move (rock, paper, or scissors). To exit the game, type \"exit\": ");
        String playerMove = scanner.nextLine();
        
        if (playerMove.equals("exit")) {
            System.out.println("Game exited.");
            return;
        }
        
        System.out.println("Computer move: " + computerMove);
        
        if (playerMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if (playerMove.equals("rock")) {
            if (computerMove.equals("scissors")) {
                System.out.println("You win!");
            } else if (computerMove.equals("paper")) {
                System.out.println("You lose!");
            }
        } else if (playerMove.equals("paper")) {
            if (computerMove.equals("rock")) {
                System.out.println("You win!");
            } else if (computerMove.equals("scissors")) {
                System.out.println("You lose!");
            }
        } else if (playerMove.equals("scissors")) {
            if (computerMove.equals("paper")) {
                System.out.println("You win!");
            } else if (computerMove.equals("rock")) {
                System.out.println("You lose!");
            }
        } else {
            System.out.println("Invalid move. Please try again.");
        }
        
        scanner.close();
    }
}*/