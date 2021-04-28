package domain;

public class Persona {
    // 1. defining protected attribs - to be inherited from child classes
    protected String name;
    protected char genre;
    protected int age;
    protected String address;
    
    // 2. defining three constructors: empty, some args, full args
    // 2.1. the empty one
    public Persona() {}
    
    // 2.2. constructor with an arg
    public Persona(String name) {
        this.name = name;
    }
    
    // 2.3. constructor with full args
    public Persona(String name, char genre, int age, String address) {
        this.name = name;
        this.genre = genre;
        this.age = age;
        this.address = address;
    }
    
    // 3. defining getters and setters
    // 3.1. for name
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 3.2. for genre
    public char getGenre() {
        return this.genre;
    }
    
    public void setGenre(char genre) {
        this.genre = genre;
    }
    
    // 3.3. for age
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // 3.4. for address
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // 4. defining toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona: {name:").append(this.name);
        sb.append(", genre:").append(this.genre);
        sb.append(", age:").append(this.age);
        sb.append(", address:").append(this.address);
        sb.append(", super.toString():").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}