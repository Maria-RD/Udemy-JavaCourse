package section5;

import java.util.Scanner;

public class SentenciasControl {
    public static void main(String args[]){
        // Ejemplo dinámico - Creando objeto de la clase Scanner
        var scanner = new Scanner(System.in);
        
        // Petición de dato
        System.out.println("EJEMPLO SENCILLO DE SENTENCIA DE CONTROL");
        System.out.print("Inserte condición (si/no): ");
        var condicion = scanner.nextLine().equals("si"); // NO COMPARAR CON == , ES CON equals()
        
        // Condición anidada
        // Buena práctica: anidar condicional con if-else en vez de if's separados
        if (condicion) {
            System.out.println("Condición verdadera.");
        } else {
            System.out.println("Condición falsa.");
        }
    }
}