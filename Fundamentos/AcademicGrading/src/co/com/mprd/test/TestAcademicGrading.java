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
        // Asking some data
        System.out.println("PASS OR FAILED - PROJECT");
        System.out.print("Quantity of students: ");
        int numStudents = Integer.parseInt(scanner.nextLine());
        // Now here we create the array object of type AcademicGrading
        AcademicGrading scores[] = new AcademicGrading[numStudents]; // 2 students, 3 scores

        System.out.println();
        
        // Asking for the scores in a loop
        for (int i = 0; i < numStudents; i++) {
            System.out.println("STUDENT #" + (i+1) + ": ");
            scores[i] = new AcademicGrading();
            System.out.print("Insert 1st score (35%): ");
            scores[i].setFirstScore(Double.parseDouble(scanner.nextLine()));
            System.out.print("Insert 2nd score (35%): ");
            scores[i].setSecondScore(Double.parseDouble(scanner.nextLine()));
            System.out.print("Insert exam score (30%): ");
            scores[i].setExamScore(Double.parseDouble(scanner.nextLine()));
            
            //setting new values
            scores[i].setFinalScore();
            scores[i].setVeredict();
            //Now here we print with the toString() method
            printToConsole(scores[i]);
            System.out.println();
        }
    }

    public static void printToConsole(AcademicGrading academicGrading) {
        System.out.println(academicGrading);
    }
}
