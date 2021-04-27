package dominio;

public class Persona {
    // Buenas practicas: usar modificador de acceso private para los atributos
    // y usar getters/setters para obtener/modificar la info
    
    // 1. creando atributos
    private String name;
    private double salary;
    private boolean deleted;
    
    // 2. creando constructor con tres argumentos
    public Persona(String name, double salary, boolean deleted) {
        this.name = name;
        this.salary = salary;
        this.deleted = deleted;
    }
    
    // 3. creando getters y setters
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public boolean isDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
