package section11;

import section7.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        // Persona persona1 = new Persona();
        Persona persona1 = null;
        // persona1.name = "Juan";
        // System.out.println("persona1.name = " + persona1.name);
        persona1 = changeValue(persona1); //aqui no se pasa persona1.name, sino la ref. 0x333 (p.ej.) de donde esta el objeto
        //System.out.println("nueva persona1.name = " + persona1.name);
    }
    
    public static Persona changeValue(Persona persona) {
        // return persona; // unreachable statement de aqui para abajo
        if (persona == null){
            System.out.println("Valor de persona inválido = null");
            return null;
        }
        persona.name = "María";
        return persona;
        // return ; // void - el compilador add este return para ir al method que lo llamó
    }
}