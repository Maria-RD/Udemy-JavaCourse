package scores;

import java.util.Scanner;

public class TestExercise2 {
    public static void main(String args[]){
        // Interactive exercise - creating object of the Scanner class
        Scanner scanner = new Scanner(System.in);
        
        // Now here we create the object of the Exercise2 class
        // Exercise2 finalScore1 = new Exercise2();
        
        // Now here we create the object with some values by default
        Exercise2 finalScore1 = new Exercise2(4.5, 2.5, 3.0);
        System.out.println(finalScore1.firstScore + " " + finalScore1.secondScore + " " + finalScore1.examScore);
        
//        // Asking for some data
//        System.out.println("PASS OR FAILED");
//        System.out.print("Insert 1st score (35%): ");
//        double firstScore = Double.parseDouble(scanner.nextLine());
//        System.out.print("Insert 2nd score (35%): ");
//        double secondScore = Double.parseDouble(scanner.nextLine());
//        System.out.print("Insert exam score (30%): ");
//        double examScore = Double.parseDouble(scanner.nextLine());
        
        // Now here we use the finalScoreCalculation method
        // passing two partial scores and the exam score
        // double result = finalScore1.finalScoreCalculation(firstScore, secondScore, examScore);
        double result = finalScore1.finalScoreCalculation(finalScore1.firstScore, finalScore1.secondScore, finalScore1.examScore);
        System.out.println("The final score is = " + result);
        System.out.println("El estudiante pasó: " + finalScore1.passedOrFailed());
    }
}