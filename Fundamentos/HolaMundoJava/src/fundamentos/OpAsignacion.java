package fundamentos;

public class OpAsignacion {
    public static void main(String args[]){
        int a=3, b=2; // No se puede utilizar "var"
        var c = a+5-b; // Izq. a der. (3)+5-(2)
        System.out.println("c = " + c); // c=6
        
        // EJEMPLO CON "a"
        System.out.println("a = " + a); // a=3
        
        // Composición de suma
        a+=1; // a=a+1
        System.out.println("a+=1 = " + a); // a=4
        
        a+=3; // a=a+3
        System.out.println("a+=3 = " + a); // a=7
        
        // Composición de resta
        a-=2; // a=a-2
        System.out.println("a-=2 = " + a); // a=5
        
        // Ejercicios de composición: *= /= %=
        // Composición de multiplicación
        a*=6; // a=a*6
        System.out.println("a*=6 = " + a); // a=30
        
        // Composición de división
        a/=10; // a=a/10 - Es entero porque al principio se declaró como "int"
        System.out.println("a/=10 = " + a); // a=3
        
        // Composición de módulo
        a%=2;
        System.out.println("a%=2 = " + a); // a=1
    }
}