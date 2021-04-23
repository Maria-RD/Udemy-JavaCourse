package section3;

import java.util.Scanner;

public class ConvertirPrimitivosP2 {
    public static void main(String args[]){
        // Convertir int -> String
        var edadTxt = String.valueOf(10);
        System.out.println("edadTxt = " + edadTxt);
        
        // Ejemplo sin interacción
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        // Ejemplo con interacción - clase Scanner
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un catacter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}