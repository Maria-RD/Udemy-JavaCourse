package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        // "final" concept: variables
        final int num = 10;
        System.out.println("num = " + num);
        // num = 8; -> ERRROR

        // another example
        System.out.println("Persona.MY_CONSTANT = " + Persona.MY_CONSTANT);
        // Persona.MY_CONSTANT = 8; -> ERROR

        // FINAL CONCEPT IN OBJECTS
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); // Cannot assign a value to final variable
        persona1.setName("Juan");
        System.out.println("persona1 name = " + persona1.getName());
        persona1.setName("Karla");
        System.out.println("persona1 name = " + persona1.getName());
    }
}
