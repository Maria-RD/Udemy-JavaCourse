package test;

import domain.Persona;

public class TestMatrix {
    public static void main(String[] args) {
        // matrix with primitive values
        int scores[][] = new int[4][3];
        //System.out.println(scores.length);
        
        // creating objects dynamically
        // "length" counts how many columns are in an array
        for (int i=0; i<scores.length; i++) {
            for (int j=0; j<scores[i].length; j++) {
                scores[i][j] = i*j;
                System.out.println("scores[" + i + "][" + j + "] = " + scores[i][j]);
            }
        }
        
        System.out.println();
        
        // creating another matrix - initialized
        //String fruits[][] = new String[3][2];
        // OMG! the number of the columns between one and another row CAN vary!! :O
        String fruits[][] = {{"Andrew","Chocolate","Arizona"},{"Ana","Orange","Colorado", "m"}};
        print(fruits);
        
//        for (int i=0; i<fruits.length; i++) {
//            for (int j=0; j<fruits[i].length; j++) {
//                System.out.println("fruits[" + i + "][" + j + "] = " + fruits[i][j]);
//            }
//        }
        
        // another matrix = type Person
        System.out.println("");
        Persona personas[][] = new Persona[2][3];
        print(personas);
        
//        // assign some values dynamically
//        for (int i=0; i<personas.length; i++) {
//            for (int j=0; j<personas[i].length; j++) {
//                personas[i][j] = new Persona(String.valueOf(i) + "_Name_" + String.valueOf(j));
//                System.out.println("personas[" + i + "][" + j + "] = " + personas[i][j]);
//            }
//        }
    }
    
    // Creating a method to handle matrixes
    public static void print(Object matrix[][]) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = new Persona(String.valueOf(i) + "_" + String.valueOf(j));
                }
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}
