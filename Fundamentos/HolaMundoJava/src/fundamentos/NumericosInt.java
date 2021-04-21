package fundamentos;

public class NumericosInt {
    public static void main(String args[]){
        //short numeroShort = 10;
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor mínimo Short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo Short: " + Short.MAX_VALUE);
        
        //int numeroInt = 15;
        int numeroInt = (int)2147483648L; // L al final = tipo long
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("Valor mínimo Integer: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo Integer: " + Integer.MAX_VALUE);
        
        // long numeroLong = 20;
        //long numeroLong = 9223372036854775807; /* Error */
        //long numeroLong = 9223372036854775808L; /* Aún muy grande... */
        //long numeroLong = (long)9223372036854775808L; /* Todavía grande */
        //long numeroLong = (long)9223372036854775808D;/* Se recurre a double */
        long numeroLong = 9223372036854775807L; /* O se deja L pero -1 nro. */
        System.out.println("numeroLong: " + numeroLong);
        System.out.println("Valor mínimo Long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo Long: " + Long.MAX_VALUE);
    }
}
