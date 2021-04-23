package section4;

import java.util.Scanner;

public class OpAritmeticos {
    public static void main(String[] args) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("Resultado de la suma = " + resultado);
        
        resultado = a - b;
        System.out.println("Resultado de la resta = " + resultado);
        
        resultado = a * b;
        System.out.println("Resultado de la multiplicación = " + resultado);
        
        // var resultado = a / b; // Resultado 1 (int)
        var resultado2 = 3D / b;
        System.out.println("Resultado de la división = " + resultado2);
        
        resultado = a % b;
        System.out.println("Resultado del módulo = " + resultado);
        
        /*
            Algoritmo PAR-IMPAR
        */
        System.out.println("");
        System.out.println("ALGORITMO PAR-IMPAR");
        // Creando objeto Scanner
        var scanner = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        var n = Integer.parseInt(scanner.nextLine());
        if ((n % 2) == 0)
            System.out.println("n = " + n + " es par.");
        else 
            System.out.println("n = " + n + " no es par.");
    }
    
}
