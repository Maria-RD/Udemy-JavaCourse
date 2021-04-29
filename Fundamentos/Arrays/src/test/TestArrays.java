package test;

public class TestArrays {
    public static void main(String[] args) {
        // Practicing - arrays (primitive types)
        // SYNTAX: type nameVariable[] = new type[lenght];
        double scores[] = new double[3];
        System.out.println(scores);
        
        // modifyng elements
        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);
        scores[0] = 4.5;
        scores[1] = 5.0;
        scores[2] = 4.0;
        System.out.println("\nscores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);
        System.out.println("");
        
        // trying to assign a value to an inexistent element of the array
        // scores[3] = 5.0;
        
        // using for cycle
        for (int i=0; i<scores.length; i++) {
            //scores[i] = i * 1.0;
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }
}
