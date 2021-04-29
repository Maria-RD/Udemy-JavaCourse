package test;

import domain.Persona;

public class TestObjectArrays {

    public static void main(String[] args) {
        // creating array personas[] of type Persona
        Persona personas[] = new Persona[3];

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona(String.valueOf(i) + "_Name"); // creating new object
            System.out.println("personas[" + i + "] = " + personas[i].getName());
            // another way
            System.out.println(personas[i]);
        }
        
        // creating and initializing array - two steps in one!
        String fruits[] = {"Apple", "Orange", "Strawberry"};
        for (int i=0; i<fruits.length; i++) {
            System.out.println("fruit[" + i + "] = " + fruits[i]);
        }
    }
}
