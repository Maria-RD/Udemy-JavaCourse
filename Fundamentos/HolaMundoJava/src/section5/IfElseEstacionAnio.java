package section5;

import java.util.Scanner;

public class IfElseEstacionAnio {
    public static void main(String args[]){
        
        // Ejercicio interactivo - Creando objeto de la clase Scanner
        var scanner = new Scanner(System.in);
        
        // Ejemplo 2: condición anidada
        // Buena práctica: anidar todo con if-else, en vez de if's separados
        System.out.println("CÁLCULO ESTACIÓN DEL AÑO - if-else");
        System.out.print("Inserte número del mes: ");
        var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "Estación desconocida";
        
        // Condicional if-else anidada
        if (mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5 ) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8 ) {
            estacion = "Verano";
        } else if ( mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        
        // Imprimiendo resultado
        System.out.println("estacion = " + estacion);
    }
}
