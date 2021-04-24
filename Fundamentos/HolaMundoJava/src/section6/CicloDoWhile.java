package section6;

import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String args[]){
        // Ejercicio interactivo - Creando objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pidiendo información
        System.out.println("CICLO DO-WHILE - NÚMERO LÍMITE");
        System.out.print("Inserte número límite (> 0): ");
        int limite = Integer.parseInt(scanner.nextLine());
        
        // CICLO DO-WHILE: SE EJECUTA al menos una vez (do) EN CASO TAL de que no cumpla
        // con la condición dada. La única diferencia con respecto al While
        int contador = 0;
        do { // 1ro hace, después evalúa: do {...} while (condicion);
            System.out.println("contador = " + contador); // ...y luego si se incrementa (++) (incremento pendiente)
            System.out.println("condicion = " + (contador < limite)); // Again entre paréntesis
            System.out.println("contador++ = " + contador++); // Solo para visualizar que 1ro se usa...
            // contador++; // así se usaría normalmente
        } while (contador < limite);
        
        // Finalización del ciclo do-while
        System.out.println("Finalización del ciclo Do-While.");
    }
}