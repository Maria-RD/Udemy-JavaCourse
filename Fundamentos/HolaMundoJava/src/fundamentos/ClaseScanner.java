package fundamentos;

// Clase ClaseScanner

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String args[]){
    //var nombre = "María P.";
    //System.out.println(nombre);
    
    // Usando clase Scanner
    // Ingresando nombre - definiendo entrada como variable
    Scanner consola = new Scanner(System.in);
    System.out.println("Ingresa un nombre: ");
    var usuario = consola.nextLine();
    System.out.println("usuario = " + usuario);
    
    System.out.println("Inserta el título: ");
    var titulo = consola.nextLine();
    System.out.println("Resultado = " + titulo + " " + usuario);
    }
}