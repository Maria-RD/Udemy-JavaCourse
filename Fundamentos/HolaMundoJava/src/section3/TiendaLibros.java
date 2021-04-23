package section3;

import java.util.Scanner;

public class TiendaLibros {
    public static void main(String args[]){
        // Creando objeto de tipo Scanner
        var scanner = new Scanner(System.in);
        
        // Petición de datos
        System.out.println("LIBRERÍA MARIA P. BOOKSTORE:");
        System.out.print("Proporciona el nombre: ");
        var nombreLibro = scanner.nextLine();
        System.out.print("Proporciona el id (#): ");
        var idLibro = Integer.parseInt(scanner.nextLine());
        System.out.print("Proporciona el precio ($): ");
        var precioLibro = Double.parseDouble(scanner.nextLine());
        System.out.print("Proporciona el envío gratuito (true/false): ");
        var envioLibro = Boolean.parseBoolean(scanner.nextLine());
        
        // Impresión de datos
        System.out.println("RESULTADOS");
        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio: $" + precioLibro);
        System.out.println("Envío gratuito: " + envioLibro);
    }
}
