package fundamentos;

// Clase Concatenacion

public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // Se realiza suma de números
        System.out.println(i + j + usuario); // De izq. a der.
        System.out.println(usuario + i + j); // Contexto cadena
        System.out.println(usuario + (i + j)); //Overriding Contexto Cadena
    }
}
