package section11;

public class PasoPorValor {
    // Solo se pasa una copia del valor de la variable primitiva
    // por eso NO se puede modificar
    
    public static void main(String[] args) {
       int x = 10;
       System.out.println("x = " + x);
       cambioValor(x);
       System.out.println("nuevo valor = " + x);
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 20;
    }
}