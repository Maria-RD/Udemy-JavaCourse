package section5;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String args[]){
        // Ejercicio Sistema de Calificaciones - dinámico
        Scanner scanner = new Scanner(System.in);
        
        // Pidiendo información
        System.out.println("SISTEMA DE CALIFICACIONES");
        System.out.print("Proporciona un valor entre 0 y 10: ");
        int nota = Integer.parseInt(scanner.nextLine()); // lee un "String", convierte a "int"
        String notaTxt;
        
        // Estructura condicional - Toca con if-else porque switch-case trabaja
        // solo con "int" y con "String", no con double, float...
        if (nota >= 9 && nota <= 10 ) {
            notaTxt = "A";
        } else if (nota >= 8 && nota < 9) {
            notaTxt = "B";
        } else if (nota >=7 && nota < 8) {
            notaTxt = "C";
        } else if (nota >= 6 && nota < 7) {
            notaTxt = "D";
        } else if (nota >= 0 && nota < 6) {
            notaTxt = "F";
        } else {
            notaTxt = "Valor desconocido";
        }
        
        // Imprimiendo resultados
        System.out.println(notaTxt);
    }
}