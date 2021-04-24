package section6;

import java.util.Scanner;

public class CicloWhile {
    public static void main(String args[]){
        
        // Ejercicio interactivo - creando objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Pidiendo información
        System.out.println("CICLO WHILE - NÚMERO LÍMITE");
        System.out.print("Inserte número límite (> 0): ");
        int limite = Integer.parseInt(scanner.nextLine());
        
        // CICLO WHILE: NO se ejecuta el código a repetir si la condición es falsa
        // Se ejecuta hasta que la condición sea "false"
        int contador = 0;
        while(contador < limite){ // ...aquí hace suma (++) pendiente en línea 21
            System.out.println("contador = " + contador);
            System.out.println("condicion = " + (contador<limite)); // Con p/tesis o sino el compilador no lo entiende
            System.out.println("contador++ = " + contador++); //  Ope. unario posincremento = 1ro utiliza, luego suma (++)...
            // contador++; // ya de manera no didáctica, se usa esto como standard
        }
        
        // Ya... finalizó ciclo while
        System.out.println("Finalización del ciclo While.");
    }
}