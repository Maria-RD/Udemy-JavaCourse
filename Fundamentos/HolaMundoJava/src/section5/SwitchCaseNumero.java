package section5;

import java.util.Scanner;

public class SwitchCaseNumero {
    public static void main(String args[]){
        // Ejercicio interactivo - creando objeto de la clase Scanner
        var scanner = new Scanner(System.in);
        
        // Ejercicio 5: evaluando si número se encuentra del 1 al 4
        System.out.println("EJERCICIO 5: ESTRUCTURA SWITCH-CASE - EVALUAR SI NÚM. SE ENCUENTRA DEL 1 AL 4");
        System.out.print("Insertar número cualquiera: ");
        var numero = Integer.parseInt(scanner.nextLine());
        var numeroTexto = "";
        
        // Estructura switch-case
        // Al igual que con if-else, se recomienda anidarla con "break" en vez de dejar muchos "switch's"
        switch (numero) { // como en el if-else, se escribe la variable a evaluar
            case 1: // aqui, si "numero" es igual a "1", entonces...
                numeroTexto = "uno"; // setea
                break; // y cierra la estructura switch
            case 2: // si "numero = 2"
                numeroTexto = "dos"; // lo setea
                break; // cierra estructura switch... y así
            case 3:
                numeroTexto = "tres";
                break;
            case 4:
                numeroTexto = "cuatro";
                break;
            default: // viene siendo el "else" final de un if-else if-else
                 numeroTexto = "Número no encontrado";
        }
        
        // Impresión de los resultados
        System.out.println("numeroTexto = " + numeroTexto);
    }
}