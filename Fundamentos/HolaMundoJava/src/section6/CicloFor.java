package section6;

import java.util.Scanner;

public class CicloFor {

    public static void main(String args[]) {
        // Ejercicio interactivo - creando objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        // Pidiendo información
        System.out.println("CICLO FOR - NÚMERO LÍMITE");
        System.out.print("Inserte número límite (> 0): ");
        int limite = Integer.parseInt(scanner.nextLine());
         
        /* 
             Ciclo For
             estructura contador-condición-incremento en una sola expresión
             A DIFERENCIA del ciclo while y do-while, en el for la variable del contador "i"
             se crea solo para ese ciclo y se destruye una vez termina el for
             y se ejecuta solo la sección del condicional e incremento
        */
        //int limite = 3;
        for (int i=0; i<limite; i++) { // para no romper la estructura, no se imprime el incremento
            System.out.println("i = " + i);
            System.out.println("condicion = " + (i < limite));
        }
        
        // Finalización ciclo for
        System.out.println("Finalización del ciclo For.");
    }
}