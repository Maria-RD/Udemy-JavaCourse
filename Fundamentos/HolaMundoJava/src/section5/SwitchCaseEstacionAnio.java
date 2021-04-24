package section5;

import java.util.Scanner;

public class SwitchCaseEstacionAnio {
    public static void main(String args[]){
        // Ejemplo interactivo - creando nuevo objeto con clase Scanner
        var scanner = new Scanner(System.in);
        
        // Ejemplo 1: switch-case estación del año en America
        System.out.println("CÁLCULO ESTACIÓN DEL AÑO - switch-case");
        System.out.print("Inserte número del mes: ");
        var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "";
        
        // Buena práctica: anidar switch-case con "break". Al igual que en el if-else
        // si no se pone, se deja evaluando cada case, así cumpla con la condición
        switch (mes){ // se coloca adentro un condicional: si "numero"...
            case 1: case 2: case 12: // ...es igual a "1", "2" o "12"
                estacion = "Invierno"; // setea a "invierno"
                break; // se cierra el ciclo del switch!
            case 3: case 4: case 5: // y así sucesivamente...
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break; // hasta...
            default: // ..."default": viene siendo el "else" en un "if-else if-else"
                estacion = "Estación no encontrada";
        }
        
        // Imprimiendo resultados
        System.out.println("estacion + " + estacion);
    }
}
