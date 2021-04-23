package fundamentos;

import java.util.Scanner;

public class EjemploRectangulo {
    public static void main(String args[]){
        // Creando el objeto de la clase Scanner
        var scanner = new Scanner(System.in);
        
        // Petición
        System.out.println("ÁREA Y PERÍMETRO DE RECTÁNGULO");
        System.out.print("Proporciona el alto: ");
        var alto = Integer.parseInt(scanner.nextLine()); // "alto" es "int"
        System.out.print("Proporciona el ancho: ");
        var ancho = Integer.parseInt(scanner.nextLine()); // "ancho" es "int"
        
        // Operación
        var area = alto*alto; // alto*alto -> NO ES VALIDO "alto^2"
        var perimetro = (alto + ancho) * 2;
        
        // Imprimiendo resultados
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
