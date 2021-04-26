package ejerciciocaja;

public class Caja {
    // 1. Definiendo los atributos de la clase Caja
    int ancho, alto, profundo;
    
    // 1.1. Se crea 1er constructor vacio
    public Caja() {
        System.out.println("Ejecutando constructor vacío.");
    }
    
    // 1.2. Se crea segundo constructor vacio
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    // 2. Se crea metodo para calcular volumen de la caja
    public int calcularVolumen(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        return this.ancho * this.alto * this.profundo;
    }
}
