import java.util.Scanner;

public class test {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.print("What place did you get in the race? ");
        int place = scanner.nextInt();
        
        if (place == 1) {
            System.out.println("Congratulations! You get the gold medal!");
        } else if (place == 2) {
            System.out.println("Great job! You get the silver medal!");
        } else if (place == 3) {
            System.out.println("Well done! You get the bronze medal!");
        } else {
            System.out.println("Good effort! You finished in " + place + "th place.");
        }
        
        scanner.close();
    }
}