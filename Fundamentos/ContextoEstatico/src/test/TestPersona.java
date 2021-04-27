package test;

import domain.Persona;

public class TestPersona {
    private int counter;
    
    public static void main(String[] args) {
        // 1. creando persona1 - objeto Persona
        Persona persona1 = new Persona("MariaP");
        
        // 1.1 imprimiendo contenido del objeto al que apunta persona1
        // System.out.println(persona1); // toString()
        print(persona1);
        
        // 2. creando persona2 - objeto Persona
        Persona persona2 = new Persona("Karla");
        
        // 2.1. imprimiendo contenido del objeto al que apunta persona2
        // System.out.println(persona2); // toString()
        print(persona2);
        
        // 3. ejemplo de ERROR al usar this en un static method
        // this.counter; // ERROR
    }
    
    // creando otro static method...
    public static void print(Persona persona){
        System.out.println(persona);
    }
    
    // Creando dinamic method...
    public int getContador(){
        print(new Persona("Laura")); // se le pasa el arg. del objeto creandolo
        return this.counter; // SI SE PUEDE usar this 'cause no es un static method
    }
}