package ejerciciocaja;

import java.util.Scanner;

public class PruebaCaja {

    public static void main(String[] args) {
        // 1. ejercicio dinamico para constructor vacio - objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        
        // 2. creando objeto constructor vacio
        Caja caja1 = new Caja();
        
        // 2.1. pidiendo informacion
        System.out.println("LABORATORIO - PROYECTO CAJA (CONSTRUCTOR VACIO)");
        System.out.print("Insertar ancho de la caja: ");
        caja1.ancho = Integer.parseInt(scanner.nextLine());
        System.out.print("Insertar alto de la caja: ");
        caja1.alto = Integer.parseInt(scanner.nextLine());
        System.out.print("Insertar profundo de la caja: ");
        caja1.profundo = Integer.parseInt(scanner.nextLine());
        
        // 2.2. pasando parametros al metodo calcularVolumen()
        int volumen1 = caja1.calcularVolumen(caja1.ancho, caja1.alto, caja1.profundo);
        System.out.println("Volumen de la caja = " + volumen1);

        // 3. creando objeto con valores por default - constructor con argumentos
        Caja caja2 = new Caja(3, 2, 6);
        
        // 3.1. se omite lo de pedir informacion
        System.out.println("");
        System.out.println("LABORATORIO - PROYECTO CAJA (CONSTRUCTOR CON PARAMETROS 3*2*6)");
        
        // 3.2. pasando parametros definidos en el constructor a calcularVolumen()
        int volumen2 = caja2.calcularVolumen(caja2.alto, caja2.ancho, caja2.profundo);
        System.out.println("Volumen de la caja = " + volumen2);
    }
}
