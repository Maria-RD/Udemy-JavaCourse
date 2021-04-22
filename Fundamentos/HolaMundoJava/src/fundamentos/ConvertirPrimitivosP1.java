package fundamentos;

import java.util.Scanner;

public class ConvertirPrimitivosP1 {
    public static void main(String args[]){
        // Convertir String -> int
        var edad = Integer.parseInt("20"); // String -> int: Integer.parseInt()
        // var edad = "20";
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        // Pedir un valor con Scanner
        var consola = new Scanner(System.in);
        System.out.print("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad); // Edad tipo int
        System.out.println("edad + 5 = " + (edad+5)); // Op. aritmética. con edad
    }
}
