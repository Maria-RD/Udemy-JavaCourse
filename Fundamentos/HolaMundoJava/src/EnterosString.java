
public class EnterosString {
    public static void main(String args[]) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificando el valor de la variable
        miVariableEntera=5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena="Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena="Adiós";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        //System.out.println(miVariableCadena2);
        //Probando concatenación con soutv
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }
}
