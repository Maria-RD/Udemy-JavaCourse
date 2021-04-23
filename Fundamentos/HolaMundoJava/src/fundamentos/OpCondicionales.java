package fundamentos;

import java.util.Scanner;

public class OpCondicionales {
    public static void main(String args[]){
        // Operadores condcionales - interactivo con Scanner
        var scanner = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.println("EJERCICIO OPERADORES CONDICIONALES - RANGO 0-10");
        System.out.print("Insertar número cualquiera: ");
        var a = Integer.parseInt(scanner.nextLine());
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado = (a >= valorMinimo && a <= valorMaximo);
        if (resultado){
            System.out.println("Valor: " + a + ". Se encuentra dentro de " + valorMinimo + " y " + valorMaximo + ".");
        }
        else {
            System.out.println("Valor: " + a + ". No se encuentra dentro de " + valorMinimo + " y " + valorMaximo + ".");
        }
        
        // Ejercicio 2
        System.out.println("EJERCICIO ASISTIR AL JUEGO");
        // Determinar si-true y no-false
        var entrada = "";
        var vacaciones = false; // seteado con false por defecto
        var diaDescanso = false; // idem
        // var condicion = entrada.equals("si"); // Se hizo el intento de normalizar...
        
        System.out.print("¿El padre tiene vacaciones (si/no(cualquier tecla))?: ");
        //var vacaciones = Boolean.parseBoolean(scanner.nextLine());
        entrada = scanner.nextLine();
        vacaciones = entrada.equals("si");
        
        if (vacaciones) { // Como está de vacaciones, no es un día de descanso
            System.out.println("¿El padre tiene día de descanso?: no");
        } else {
            System.out.print("¿El padre tiene día de descanso (si/no(cualquier tecla)?: ");
            //var diaDescanso = Boolean.parseBoolean(scanner.nextLine());
            entrada = scanner.nextLine();
            diaDescanso = entrada.equals("si"); // setea a "true" diaDescanso
        }
        
        if (vacaciones || diaDescanso){ // Condicional si puede o no asistir
            System.out.println("El padre puede asistir al juego.");
        } else {
            System.out.println("El padre está ocupado");
        }
    }
}