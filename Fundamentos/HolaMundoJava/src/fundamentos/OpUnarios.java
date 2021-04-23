package fundamentos;

public class OpUnarios {
    public static void main(String args[]){
        // Operador unario
        var a = 3;
        var b = -a; // operador unario negativo
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Booleano
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // Incremento
        // 1.incremento (símbolo antes de la variable)
        var e = 3;
        var f = ++e; // Primero se incrementa la variable, después se usa su valor
        System.out.println("e = " + e); // e=4
        System.out.println("f = " + f); // f=4
        
        // 2.posincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; // Primero se usa el valor, después se incrementa la variable
        System.out.println("g = " + g); // g=6 Pendiente un incremento
        // h = g; // Reasignar para que tome el valor incrementado
        System.out.println("f = " + h); // h=5
        
        // Decremento
        // 1.predecremento
        var i = 2;
        var j = --i; // "j" lee primero el --, por eso refleja el decremento
        System.out.println("i = " + i); // i=1
        System.out.println("j = " + j); // j=1
        
        // 2.posdecremento
        var k = 8;
        var l = k--; // "l" lee primero "k", por eso no refleja el decremento
        System.out.println("k = " + k); // k=7
        System.out.println("l = " + l); // l=8
    }
}
