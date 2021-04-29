package domain;

public class Persona {
    // attribute
    private String name;
    
    // default constructor is not defined
    
    // constructor with one parameter
    public Persona(String name) {
        this.name = name;
    }
    
    // getters and setters
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Adding toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona: {name=").append(this.name).append("}");
        return sb.toString();
    }
}
