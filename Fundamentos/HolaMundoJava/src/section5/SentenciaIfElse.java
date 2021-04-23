package section5;

import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String args[]){
        
        // Ejemplos de Sentencia Interactivos - creando objeto Scanner
        var scanner = new Scanner(System.in);
        
        // Ejemplo 1: condición simple
        System.out.println("EJERCICIO DE CONDICIÓN SIMPLE: true O false");
        System.out.print("Insertar condición (true/false): ");
        var condicion = Boolean.parseBoolean(scanner.nextLine());
        if(condicion) { // por defecto evalúa la condicion con " == true"
            System.out.println("Condición verdadera.");
        } else {
            System.out.println("Condición falsa.");
        }
        
        // Ejemplo 2: condición anidada
        // Buena práctica: anidar todo con if-else en vez de if's separados
        System.out.println("EJERCICIO 2: CONDICIONAL IF-ELSE - EVALUAR SI NÚMERO SE ENCUENTRA DEL 1 AL 4");
        System.out.print("Insertar número cualquiera: ");
        var numero = Integer.parseInt(scanner.nextLine());
        var numeroTexto = "";
        
        // Condicion if-else anidada
        if (numero == 1) {
            numeroTexto = "uno";
        } else if (numero == 2) {
            numeroTexto = "dos";
        } else if (numero == 3) {
            numeroTexto = "tres";
        } else if (numero == 4) {
            numeroTexto = "cuatro";
        } else {
            numeroTexto = "Número no encontrado";
        }
        
        // Imprimiendo resultado
        System.out.println("numeroTexto = " + numeroTexto);
    }
}