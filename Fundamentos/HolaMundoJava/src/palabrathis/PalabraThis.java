package palabrathis;

public class PalabraThis {
    public static void main(String[] args){
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona.name = " + persona.name);
        System.out.println("persona.firstSurname = " + persona.firstSurname);
    }
}

// no se puede definir en un mismo archivo el modifier "public" para una clase
// modificador omitido = default
class Persona {
    // 1.0 add atributos
    String name, firstSurname;
    
    // 2.0 constructor con parametros
    // se ejecuta de primero porque los constructores son lo primero que se ejecutan
    Persona(String name, String firstSurname) {
        super(); // llamada implicita al constructor de la clase padre (clase Object)
        this.name = name;
        this.firstSurname = firstSurname;
        System.out.println("Imprimiendo objeto entero solo con this = " + this);
        Print print = new Print();
        print.print(this);
        //new Print().print(this); // two lines in just one
    }
}

class Print {
    // Constructor vacio de la clase Print
    Print(){
        super(); // llamado al constructor de la clase Object
    }
    
    public void print(Persona persona){
        System.out.println("persona desde print = " + persona);
        System.out.println("impresion objecto actual (this) = " + this);
    }
}