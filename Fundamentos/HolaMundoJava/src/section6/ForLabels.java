package section6;

public class ForLabels {
    public static void main(String args[]){
        /*
        Ejercicio no dinámico, para probar en consola
        A diferencia del "continue", o "break", que rompen el ciclo hijo
        se puede redirigir para que vaya al ciclo padre (en caso de ciclos anidados)
        */
        int inicioTabla = 2;
        int finTabla = 10;
        int veces = 10;
        
        // Ejemplo 1: label con break
        // inicio: // NO SE PUEDE poner label aquí, el compilador no lo reconoce.
                   // debe ir siempre antes de un ciclo (for en este caso)
        System.out.println("TABLA DEL 2 AL 10 - LABEL Y BREAK");
        inicio: // etiqueta de nombre ""inicio
        for (int i=inicioTabla; i<=finTabla; i++){
            System.out.println("TABLA DEL " + i);
            for (int j=1; j<=veces; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
                // break; // este break solo rompe el for de las "veces" (var. "j") (i * j = resultado)
                break inicio; // rompe los for hijo y padre: "veces" (var "j") y "tabla" (var. "i")
            }
            System.out.println("");
        }
        // El "break inicio" de una vez termina acá
        
        // Ejemplo 2: label con continue
        System.out.println("\nTABLA DEL 2 AL 10 - LABEL Y CONTINUE");
        otro: // ...pasa directamente aquí
        for (int i=inicioTabla; i<=finTabla; i++){
            System.out.println("TABLA DEL " + i);
            for (int j=1; j<=veces; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
                System.out.println("");
                continue otro; // De aquí...
            }
            //System.out.println("");
        }
        
    }
}