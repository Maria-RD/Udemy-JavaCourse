package section2;

// Clase EjemploLibro

import java.util.Scanner;

public class EjemploLibro {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        
        // Solicitando título
        System.out.println("Proporciona el título: ");
        var titulo = consola.nextLine();
        
        // Solicitando autor
        System.out.println("Proporciona el autor");
        var autor = consola.nextLine();
        
        // Imprimiendo resultado
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
