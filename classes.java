import java.util.Scanner; 

public class classes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the grade of your Math class?");
        double mathGrade = scanner.nextDouble();
        System.out.print("What is the grade of your Science class?");
        double scienceGrade = scanner.nextDouble();
        System.out.print("What is the grade of your History class?");
        double historyGrade = scanner.nextDouble();
        System.out.print("What is the grade of your Art class?");
        double artGrade = scanner.nextDouble();
        System.out.print("What is the grade of your English class?");
        double englishGrade = scanner.nextDouble();

        double averageGrade = (mathGrade + scienceGrade + historyGrade + artGrade + englishGrade) / 5;
        System.out.println("Your average grade is: " + averageGrade);
        scanner.close();
    }
    
  }
