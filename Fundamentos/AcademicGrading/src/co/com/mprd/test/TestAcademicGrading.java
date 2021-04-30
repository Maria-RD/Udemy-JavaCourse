package co.com.mprd.test;

import co.com.mprd.domain.AcademicGrading;
import java.util.Scanner;

public class TestAcademicGrading {

    public static void main(String args[]) {
        // Interactive exercise - creating object of the Scanner class
        Scanner scanner = new Scanner(System.in);

        /*
            CREATING FIRST OBJECT OF AcademicGrading class
         */
        // Now here we create the array object of type AcademicGrading
        AcademicGrading scores[] = new AcademicGrading[2]; // 2 students, 3 scores

        // We need to print it out somewhere
        //System.out.println("FIRST OBJECT - CONSTRUCTOR WITH ARGS");
        //printToConsole(finalScore1); // same as printToConsole(finalScore1.toString())
        // Asking for some data
        for (int i = 0; i < 2; i++) {
            System.out.println("PASS OR FAILED");
            scores[i] = new AcademicGrading();
            System.out.print("Insert 1st score (35%): ");
            scores[i].setFirstScore(Double.parseDouble(scanner.nextLine()));
            System.out.print("Insert 2nd score (35%): ");
            scores[i].setSecondScore(Double.parseDouble(scanner.nextLine()));
            System.out.print("Insert exam score (30%): ");
            scores[i].setExamScore(Double.parseDouble(scanner.nextLine()));
            System.out.println("");
            
            //setting new values
            scores[i].setFinalScore();
            scores[i].setVeredict();
            //Now here we print with the toString() method
            printToConsole(scores[i]);
        }
//        /*
//            CREATING SECOND OBJECT OF AcademicGrading class - empty constructor
//        */
//        // finalScore2 is pointing at the new created object
//        AcademicGrading finalScore2 = new AcademicGrading();
//        
//        // printing default values to this object - given directly by the compiler
//        System.out.println("\nSECOND OBJECT - CONSTRUCTOR WITHOUT ARGUMENTS");
//        printToConsole(finalScore2);
//        
//        // asking for some info to the 2nd object
//        System.out.println("PASS OR FAILED");
//        System.out.print("Insert 1st score (35%): ");
//        finalScore2.setFirstScore(Double.parseDouble(scanner.nextLine()));
//        System.out.print("Insert 2nd score (35%): ");
//        finalScore2.setSecondScore(Double.parseDouble(scanner.nextLine()));
//        System.out.print("Insert exam score (30%): ");
//        finalScore2.setExamScore(Double.parseDouble(scanner.nextLine()));
//        
//        // asigning final score and veredict to the 2nd object
//        finalScore2.setFinalScore();
//        finalScore2.setVeredict();
//        
//        // printing 2nd object
//        printToConsole(finalScore2); // same as finalScore2.toString()
    }

    public static void printToConsole(AcademicGrading academicGrading) {
        System.out.println(academicGrading);
    }
}
