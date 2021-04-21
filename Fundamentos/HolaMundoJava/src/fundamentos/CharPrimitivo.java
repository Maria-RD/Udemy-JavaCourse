package fundamentos;

public class CharPrimitivo {
    public static void main(String args[]){

        /*
            Definiendo con "char"
        */
        char letra = 'a';
        System.out.println("letra = " + letra);
        
        System.out.println("TIPO DE VARIABLE CHAR");
        
        char varChar = '\u0024';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 36;
        System.out.println("varCharDecimal = " + varCharDecimal);
                
        char varCharSimbolo = '$';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        /*
            Definiendo con "var"
        */
        System.out.println("TIPO DE VARIABLE VAR");
        
        var varChar2 = '\u0024'; // Unicode por defecto
        System.out.println("varChar2 = " + varChar2);
        
        // var varDecimal2 = 36; // Tipo int...
        var varDecimal2 = (char)36; // Conversión a "char"
        System.out.println("varDecimal2 = " + varDecimal2);
        
        var varCharSimbolo2 = '$';
        System.out.println("varCharSimbolo2 = " + varCharSimbolo2);
        
        /*
            Convirtiendo "char" (16 bits) -> "int" (32 bits)
        */
        System.out.println("CONVERSIÓN DE CHAR -> ENTERO");
        
        int varCharInt1 = '+'; // Símbolo + (char) -> 43 (int)
        System.out.println("varCharInt1 = " + varCharInt1);
        
        int varCharInt2 = 'M'; // No es lo mismo caracter 'M' mayúscula...
        System.out.println("varCharInt2 = " + varCharInt2); // 77
        
        int varCharInt3 = 'm'; // ...que caracter 'm' minúscula
        System.out.println("varCharInt3 = " + varCharInt3); // 109
    }
}