package domain;

public class Persona {
    // 1. declaring atributes
    private String name;
    
    // 2. declaring constructor with one arg.
    public Persona(String name) {
        this.name = name;
    }
    
    // 3. declaring getters and setters
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 4. declaring toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona: {name=").append(this.name).append("}");
        return sb.toString();
    }
}
