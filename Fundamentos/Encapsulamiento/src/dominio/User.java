package dominio;

public class User {
    // 1. defining attributes of User object
    private int id;
    private String name;
    private boolean status;
    
    // 2. defining constructor with values by default
    public User(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    
    // 3. defining getters and setters
    // 3.1 "id" attribute
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    // 3.2. "name" attribute
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 3.3. "status" attribute
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
}