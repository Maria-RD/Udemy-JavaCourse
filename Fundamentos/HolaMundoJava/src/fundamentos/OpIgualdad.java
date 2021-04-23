package fundamentos;

public class OpIgualdad {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("a == b = " + c); //false
        
        var d = (a != b);
        System.out.println("a != b = " + d); //true
        
        // Ejemplo con cadenas
        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = (cadena == cadena2); // compara referencia del objeto, más no la cadena
        System.out.println("e = " + e);
        
        // Modo correcto de comparar contenido de cadenas
        // NO funciona cadena.equals(cadena == cadena2)
        var f = cadena.equals(cadena2); // equals() compara si dos strings son iguales
        System.out.println("f = " + f);
    }
}
