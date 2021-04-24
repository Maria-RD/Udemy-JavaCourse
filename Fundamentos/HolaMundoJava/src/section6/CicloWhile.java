package section6;

import java.util.Scanner;

public class CicloWhile {
    public static void main(String args[]){
        
        // Ejercicio interactivo - creando objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pidiendo condicion para el ciclo while
        System.out.println("CICLO WHILE - NÚMERO LÍMITE");
        System.out.print("Inserte número límite (> 0): ");
        int limite = Integer.parseInt(scanner.nextLine());
        
        // Ciclo while - básico. Se ejecuta hasta que cumple con la condición
        int contador = 0;
        while(contador < limite){ // ...aquí hace suma (++) pendiente en línea 21
            System.out.println("contador = " + contador);
            System.out.println("condicion = " + (contador<limite)); // con p/tesis o sino el compilador no lo entiende
            System.out.println("contador++ = " + contador++); //  ope. unario posincremento = 1ro utiliza, luego suma (++)...
            // contador++; // ya de manera no didáctica, se usa esto como standard
        }
        
        // Ya... finalizó ciclo while
        System.out.println("Finalización del ciclo While.");
    }
}