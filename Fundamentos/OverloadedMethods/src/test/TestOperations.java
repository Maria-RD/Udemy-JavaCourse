package test;

import operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        int result = Operations.sum(5, 3);
        System.out.println("Resultado: " + result);
        
        double result2 = Operations.sum(2.0, 3);
        System.out.println("Resultado: " + result);
        
        var result3 = Operations.sum(3, 5L);
    }
}
