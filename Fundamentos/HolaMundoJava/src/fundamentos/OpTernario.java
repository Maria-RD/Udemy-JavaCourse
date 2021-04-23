package fundamentos;

import java.util.Scanner;

public class OpTernario {
    public static void main(String args[]){
        // Ejercicios interactivos - con Scanner
        var scanner = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.println("COMPARAR SI UN NÚMERO (n1) ES MAYOR QUE OTRO (n2)");
        System.out.print("Insertar #1: ");
        var n1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Insertar #2: ");
        var n2 = Integer.parseInt(scanner.nextLine());
        // (condicion) ? hace_algo : else
        var resultado = (n1 > n2) ? "V: " + n1 + " es mayor que " + n2 + "." : "F: " + n1 + " es menor que " + n2 + ".";
        System.out.println("resultado = " + resultado);
        
        // Par o impar
        var resNum1 = ((n1%2)==0) ? n1 + " es par." : n1 + " es impar.";
        var resNum2 = ((n2%2)==0) ? n2 + " es par." : n2 + " es impar.";
        System.out.println(resNum1);
        System.out.println(resNum2);
    }
}
