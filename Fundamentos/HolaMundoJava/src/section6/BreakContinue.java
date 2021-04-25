package section6;

public class BreakContinue {
    public static void main(String args[]){
        // Ejercicio de Break y Continue con ciclo For
        // De manera no dinámica para ver el debbuging
        
        // Definiendo límite
        int limite = 3;
        
        // For para ver break
//        System.out.println("FOR PARA VER break");
//        for (int i=0; i<limite; i++) {
//            if ((i%2)==0){
//                System.out.println("i = " + i);
//                break;
//            }
//        }
        
        // For para el continue
        System.out.println("FOR PARA VER continue");
        for (int i=0; i<limite; i++) { // ...viene de nuevo para acá
            if ((i%2)!=0) {
                System.out.println("(i%2)!=0 = " + ((i%2)!=0));
                continue; // cuando se ejecuta el continue...
                // System.out.println("Prueba2"); // directamente da error, porque el continue se salta de nuevo al for
            }
            System.out.println("i = " + i);
        }
    }
}
