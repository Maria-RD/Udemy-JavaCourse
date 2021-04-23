package fundamentos;

import java.util.Scanner;

public class EjemploNumeroMayor {
    public static void main(String args[]){
        // Creando el objeto de la clase Scanner
        var scanner = new Scanner(System.in);
        
        // Pidiendo números
        System.out.print("Proporciona el numero1: ");
        var numero1 = Integer.parseInt(scanner.nextLine()); // "numero1" es "int"
        System.out.print("Proporciona el numero2: ");
        var numero2 = Integer.parseInt(scanner.nextLine()); // "numero2" es "int"
        
        /*
        // Condicional "if" e imprimiendo resultados
        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else {
            System.out.println("El número mayor es: " + numero2);
        } */
        
        // Condicional ternario e imprimiendo resultados
        System.out.print("El mayor de los números es: ");
        System.out.println((numero1 > numero2) ? numero1 : numero2);
    }
}
