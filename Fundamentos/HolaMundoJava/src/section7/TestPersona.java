package section7;

public class TestPersona {
    // Aqui si puede ir el metodo main para crear el objeto de Persona (Ana, Juan, Carlos)
   
    public static void main(String args[]){
        //CREANDO OBJETO persona1 de la clase Persona
        Persona persona1; // Aqui no se puede colocar "var persona1", es una variable de tipo Persona
        persona1 = new Persona(); // Persona() llama al constructor creado * defecto para la clase Persona
        // Con new <Clase()> se crea el objeto como tal, y se asigna a una variable, "persona1"
        
        // Agregando valores a los atributos Persona en el objeto persona1
        System.out.println("persona1 = " + persona1); //paquete.Clase@<nombre_espacio_memoria_asignado_en_RAM>
        persona1.name = "Pepito";
        persona1.firstSurname = "Perez";
        
        // Llamando al método showInfo() de la clase Persona
        persona1.showInfo();
        
        // Persona2
        System.out.println("");
        Persona persona2 = new Persona(); // simplificado "variable (asignado a) objeto"
        System.out.println("persona2 = " + persona2);
        persona2.showInfo(); // muestra null porque están vacios los values de los atributos para este objeto
        persona2.name = "Maria";
        persona2.firstSurname = "P.";
        persona2.showInfo();
    }
}