package fundamentos;

import java.util.Scanner;

public class OpRelacionales {
    public static void main(String args[]){
        int a=3, b=2;
        var g = (a >= b);
        System.out.println("a > b = " + g); //true
        
        
        if ((a%2) == 0){
            System.out.println("Número par: el módulo de a es igual a 0.");
        } else {
            System.out.println("Número impar: El módulo de a es igual a 1.");
        }
        
        // Ejercicio edad - interactivo con Scanner
        System.out.println("EJERCICIO DE EDAD");
        var adulto = 18; 
        var scanner = new Scanner(System.in);
        System.out.print("Escribe la edad: ");
        var edad = Integer.parseInt(scanner.nextLine());
        if (edad >= adulto) {
            System.out.println("Edad: " + edad + ". Es mayor de edad.");
        } else {
            System.out.println("Edad: " + edad + ". Es menor de edad.");
        }
    }
}
