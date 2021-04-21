package fundamentos;

import java.util.Scanner;

public class ConvertirPrimitivos {
    public static void main(String args[]){
        // Convertir tipo String a tipo int
        var edad = Integer.parseInt("20");
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
