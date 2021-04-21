package fundamentos;

public class BooleanPrimitivo {
    public static void main(String args[]){
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        // Evaluando bandera
        if(varBoolean) {
            System.out.println("La bandera es verdadera.");
        } else {
            System.out.println("La bandera es falsa.");
        }
        
        // Ejercicio condicional de edad
        var edad = 10;
        //var esAdulto = edad >= 18; // Colocando expresión: devuelve true o false
        //System.out.println("esAdulto = " + esAdulto);
        if(edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad");
        }
    }
}
