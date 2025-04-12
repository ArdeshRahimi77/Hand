import java.util.Scanner;
public class booleanhw {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean RightHand = true;
        boolean LeftHand = false;
System.out.print("What hand is the gift in?");
String hand = scanner.nextLine();
if (hand.equalsIgnoreCase("Right")) {
    System.out.println(RightHand);
} else{
        System.out.println(LeftHand);
    }
    scanner.close();
         }
}




