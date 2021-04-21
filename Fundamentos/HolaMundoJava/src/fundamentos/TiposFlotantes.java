package fundamentos;

public class TiposFlotantes {
    public static void main(String args[]){
        /*
            Tipos primitivos de tipo flotante: float y double
        */
        
        // float numeroFloat = 10.0; /* Muy grande.. Float -> Double */
        // float numeroFloat = 10.0F; /* Manera 1 */
        // float numeroFloat = (float)10.0; /* Manera 2 */
        // float numeroFloat = 3.4028235E38F; /* Tipo flotante: OK, límite */
        // float numeroFloat = 3.4028236E38F; /* Demasiado grande */
        // float numeroFloat = (float)3.4028236E38D; /* Inf: Double -> Float... */
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo Float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo Float: " + Float.MAX_VALUE);
        
        // double numeroDouble = 10;
        double numeroDouble = 1.7976931348623157E308; /* Double por default */
        // double numeroDouble = (long)1.7976931348623159E308L; // No es permitido núm más grande...
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo Double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo Double: " + Double.MAX_VALUE);
    }
}
