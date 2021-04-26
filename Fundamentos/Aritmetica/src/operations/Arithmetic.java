package operations;

public class Arithmetic {
    // Buenas practicas: definir solo atributos y metodos
    
    // 1. creacion de atributos
    int a;
    int b;
    
    // 2. creacion de metodos
    
    // 2.1 metodo sin retorno (void)
    public void sumWithoutReturn() {
        int result = a + b;
        System.out.println("result = " + result); // solo imprime el resultado, pero no se puede manipular en otra clase
    }
    
    // 2.2 metodo con retorno (return) - retorna un entero (int)
    public int sumWithReturn() {
        return a + b; // con return, este resultado si se puede manipular en otra clase
    }
    
    // 2.3 Signature: definicion de metodo
    // tiene modificador acceso, tipo de retorno, nombre del method y los argumentos que recibe
    public int sumWithArguments(int arg1, int arg2) {
        a = arg1; // con esto, pasa de dejar el valor asignado en la clase donde se crea el objeto
        b = arg2; // a tomar los valores de los parámetros que se le pasaron al método
        //return a + b;
        return sumWithReturn();
    }
}