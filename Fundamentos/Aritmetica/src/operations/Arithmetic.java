package operations;

public class Arithmetic {
    // Buenas practicas: definir solo atributos y metodos
    
    // 1. creacion de atributos
    int a;
    int b;
    
    // Creando manualmente constructor vacio (sin parámetros)
    // el compilador lo crea automaticamente, pero tambien se puede manual
    public Arithmetic() {
        System.out.println("Ejecutando constructor");
    }
    
    // SOBRECARGA CONSTRUCTORES - 2 o mas constructores
    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    // 2. creacion de metodos
    
    // 2.1 metodo sin retorno (void)
    public void sumWithoutReturn() {
        int result = this.a + this.b;
        System.out.println("result = " + result); // solo imprime el resultado, pero no se puede manipular en otra clase
    }
    
    // 2.2 metodo con retorno (return) - retorna un entero (int)
    public int sumWithReturn() {
        return this.a + this.b; // con return, este resultado si se puede manipular en otra clase
    }
    
    // 2.3 Signature: definicion de metodo
    // tiene modificador acceso, tipo de retorno, nombre del method y los argumentos que recibe
    public int sumWithArguments(int a, int b) {
        this.a = a; // this hace referencia a que es un atributo de la clase, no es una variable aislada
        this.b = b; // a esos atributos (this.a y this.b) se les asignan los valores de los p/metros que recibieron
        //return a + b;
        return this.sumWithReturn();
    }
}