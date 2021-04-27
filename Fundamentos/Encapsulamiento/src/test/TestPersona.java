package test;

import dominio.*;

public class TestPersona {
    public static void main(String[] args) {
        // 1. se crea objeto de tipo Persona
        Persona persona1 = new Persona("María", 5000.00, false);
        
        // 2. se modifica el atributo name con el setter
        persona1.setName("Juan");
        // persona1.name = "Juan"; - modificador acceso private
        
        // 3. se imprime el nuevo name con el getter
        // System.out.println(persona1.name); - modificador acceso privado
        System.out.println("persona1.getName() = " + persona1.getName());
    }
}
