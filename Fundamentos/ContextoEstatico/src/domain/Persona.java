package domain;

public class Persona {
    // 1. definiendo atributos estaticos y no estaticos
    private int idPersona;
    private String name;
    private static int countPeople;
    
    // 2. definiendo constructor con argumento
    // also asignando al idPersona el incremento con la variable estatica
    public Persona(String name) {
        super();
        this.name = name;
        // Manera 1 de incrementar - preincremento
        this.idPersona = ++Persona.countPeople;
        // Manera 2 de incrementar - posincremento con OTRA linea
        //Persona.countPeople++;
        //this.idPersona = Persona.countPeople;
    }
    
    // 3. definiendo getters y setters
    // 3.1. para idPersona
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    // 3.2. para name
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 3.3. para el attrib estatico countPeople
    public int getCountPeople() {
        return Persona.countPeople;
    }
    
    public void setCountPeople(int countPeople) {
        Persona.countPeople = countPeople;
    }
    
    // 4. definiendo method toString()
    @Override
    public String toString() {
        return "Persona = {idPersona:" + this.idPersona + ", name:" + this.name 
                + ", countPeople:" + Persona.countPeople + "}";
    }
}