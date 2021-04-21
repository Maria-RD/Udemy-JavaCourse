// Clase CaracteresEspeciales

public class CaracteresEspeciales {

    public static void main(String args[]) {
        var nombre = "María P.";

        System.out.println("Nueva línea: \n" + nombre); // New line
        System.out.println("Tabulador: \t" + nombre); // Using tab
        System.out.println("Retroceso: \b" + nombre); // Single backspace
        System.out.println("Retroceso: \b\b" + nombre); // Double backspace
        System.out.println("Comilla simple: \'" + nombre + "\'"); // Escape
        System.out.println("Comilla doble: \"" + nombre + "\""); // Escape
    }
}
