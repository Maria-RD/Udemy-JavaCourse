package fundamentos;

// Clase TiposPrimitivos

public class TiposPrimitivos {
    public static void main(String args[]){
        /*
            Tipos primitivos enteros: byte, short, int, long
        */
        // byte numeroByte = 10;
        byte numeroByte = (byte)129;
        System.out.println(numeroByte);
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte: " + Byte.MAX_VALUE);
        // Test: System.out.println("Tipo: " + numeroByte)
    }
}