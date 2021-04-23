package section4;

import java.util.Scanner;

public class PrecedenciaOperadores {
    public static void main(String args[]){
        // Ejemplo dinámico - Scanner
        var scanner = new Scanner(System.in);
        
        // Ejemplo 1: ejemplo con operadores unarios - incremento y decremento
        System.out.println("PRUEBA DE PRECEDENCIA OPERADORES - UNARIOS");
        System.out.print("Inserte el #1: ");
        var n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Inserte el #2: ");
        var n2 = Integer.parseInt(scanner.nextLine());
        var precedencia = (++n1 + n2--); // n1 se incrementa ; n2 usa el valor que se le dio
        System.out.println("++n1 + n2-- = precedencia");
        System.out.println("n1 = " + n1); // "n1" ya venía incrementado
        System.out.println("n2 = " + n2); // incremento pendiente: "n2" apenas se incrementa al leerlo
        System.out.println("precedencia = " + precedencia);
        
        // Ejemplo 2: ejercicio prioridad: "*" y "/" tienen mas prioridad que "+" y "-"
        System.out.print("Inserte el #3: ");
        var n3 = Integer.parseInt(scanner.nextLine());
        System.out.print("Inserte el #4: ");
        var n4 = Integer.parseInt(scanner.nextLine());
        // "n1" viene aumentado y "n2" ya viene disminuido
        // "operacion" es "int" en vez de "float" o "double" porque n1 n2 n3 n4 son "int".
        // Si alguno fuera flotante, "operacion" seria "float" o "double"
        //var operacion = n1 + n2 * n3 / n4; // n1 + ((n2*n3)/n4)
        var operacion = n1 + n2 * (float)n3 / n4; // "operacion" ahora es flotante "float"
        System.out.println("n1 + n2 * (float)n3 / n4 = n1 + ((n2*n3)/n4)");
        System.out.println("operacion = " + operacion);
        
        // Ejemplo 3: ejercicio prioridad: "(" ")" tienen más prioridad que "*" y "/" y que "+" y "-"
        operacion = (n1 + n2) * n3 / n4; // ((n1+n2)*(n3))/n4
        System.out.println("(n1 + n2) * n3 / n4 = ((n1+n2)*n3)/n4");
        System.out.println("operacion = " + operacion);
    }
}