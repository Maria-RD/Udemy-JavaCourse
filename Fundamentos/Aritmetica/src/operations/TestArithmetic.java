package operations;

public class TestArithmetic {
    public static void main(String[] args) {
        
        // Variables locales al method main()
        int a = 10;
        int b = 2;
        miMetodo();
        
        // Buenas practicas: se crea objeto de la clase Arithmetic
        Arithmetic arithmetic1 = new Arithmetic(10, 7);
        System.out.println("arithmetic.a = " + arithmetic1.a);
        System.out.println("arithmetic.b = " + arithmetic1.b);
        
        // Se asisnan valores a los atributos definidos en el "molde" - SOLO para methods sin argumentos
        //arithmetic1.a = 3;
        //arithmetic1.b = 2;
        
        // Se llaman los metodos definidos en el "molde"
        // System.out.println(arithmetic1.sumWithoutReturn()); // como es "void", da error al tratar de retornar
        // method sin return
        arithmetic1.sumWithoutReturn();
        
        // method con return
        int result = arithmetic1.sumWithReturn(); // guardando retorno en variable local "result"
        System.out.println("result with return = " + result);
        // System.out.println(arithmetic1.sumWithReturn()); // aqui si retorna el valor, caso contrario al otro method
        
        // method con return + parametros
        // parametros: lo que se le envía al metodo (que recibe argumentos)
        // int result2 = arithmethic1.sumWithArguments(arithmetic.a, arithmetic.b);
        int result2 = arithmetic1.sumWithArguments(arithmetic1.a, arithmetic1.b);
        System.out.println("result with return + arguments = " + result2);
        
        // garbage collector... modo didáctico, en realidad se gestiona diferente
        //arithmetic1 = null; // variable se destruye al terminar ese method
        //System.gc(); // gc() garbage collector = no se utiliza en la real life
    }
    
    public static void miMetodo() {
        // la variable esta fuera del alcance donde fue definida
        // a = 10;
        System.out.println("otro method");
    }
}