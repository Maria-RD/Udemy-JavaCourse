package test;

import domain.AcademicGrading;
import java.util.Scanner;

public class TestAcademicGrading {
    public static void main(String args[]){
        // Interactive exercise - creating object of the Scanner class
        Scanner scanner = new Scanner(System.in);
                
        /*
            CREATING FIRST OBJECT OF AcademicGrading class
        */
        // Now here we create the object with some values by default
        AcademicGrading finalScore1 = new AcademicGrading(4.5, 5.0, 5.0);
        
        // We need to print it out somewhere
        System.out.println("FIRST OBJECT - CONSTRUCTOR WITH ARGS");
        printToConsole(finalScore1); // same as printToConsole(finalScore1.toString())
        
        // Asking for some data
        System.out.println("PASS OR FAILED");
        System.out.print("Insert 1st score (35%): ");
        finalScore1.setFirstScore(Double.parseDouble(scanner.nextLine()));
        System.out.print("Insert 2nd score (35%): ");
        finalScore1.setSecondScore(Double.parseDouble(scanner.nextLine()));
        System.out.print("Insert exam score (30%): ");
        finalScore1.setExamScore(Double.parseDouble(scanner.nextLine()));
        
        // setting new values
        finalScore1.setFinalScore();
        finalScore1.setVeredict();
        
        // Now here we print with the toString() method
        printToConsole(finalScore1);
        
        /*
            CREATING SECOND OBJECT OF AcademicGrading class - empty constructor
        */
        // finalScore2 is pointing at the new created object
        AcademicGrading finalScore2 = new AcademicGrading();
        
        // printing default values to this object - given directly by the compiler
        System.out.println("\nSECOND OBJECT - CONSTRUCTOR WITHOUT ARGUMENTS");
        printToConsole(finalScore2);
        
        // asking for some info to the 2nd object
        System.out.println("PASS OR FAILED");
        System.out.print("Insert 1st score (35%): ");
        finalScore2.setFirstScore(Double.parseDouble(scanner.nextLine()));
        System.out.print("Insert 2nd score (35%): ");
        finalScore2.setSecondScore(Double.parseDouble(scanner.nextLine()));
        System.out.print("Insert exam score (30%): ");
        finalScore2.setExamScore(Double.parseDouble(scanner.nextLine()));
        
        // asigning final score and veredict to the 2nd object
        finalScore2.setFinalScore();
        finalScore2.setVeredict();
        
        // printing 2nd object
        printToConsole(finalScore2); // same as finalScore2.toString()
    }
    
    public static void printToConsole(AcademicGrading academicGrading) {
        System.out.println(academicGrading);
    }
}