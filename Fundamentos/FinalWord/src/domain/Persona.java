package domain;

// "final" concept: classes
public final class Persona {
// public class Persona {
    // "final" concept: method
    
    public final static int MY_CONSTANT = 5;
    
    public final void print() {
        System.out.println("Print method");
    }
    
    // FINAL CONCEPT IN OBJECTS
    private String name;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
