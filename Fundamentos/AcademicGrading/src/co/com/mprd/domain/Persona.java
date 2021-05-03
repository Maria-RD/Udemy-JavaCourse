package co.com.mprd.domain;

import java.util.Date;

public class Persona {
    // 1. defining attribs
    protected String name, firstSurname;
    protected Date birthDate;
    protected char gender;
    
    // 1. defining constructors
    // 1.1. default constructor
    public Persona() {
        
    }
    
    // 1.2. overloaded constructor (for testing purposes)
//    public Persona(String name, String firstSurname, Date birthDate, char gender) {
//        this(); // calling the default constructor
//        this.name = name;
//        this.firstSurname = firstSurname;
//        this.birthDate = birthDate;
//        this.gender = gender;
//    }
    
    // 2. getters and setters
    // 2.1. name
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 2.2. firstSurname
    public String getFirstSurname () {
        return this.firstSurname;
    }
    
    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }
    
    // 2.3. birthDate
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    // 2.4. gender
    public char getGender() {
        return this.gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    // 3. toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona: {name=").append(this.name);
        sb.append(", firstSurname=").append(this.firstSurname);
        sb.append(", birthDate=").append(this.birthDate);
        sb.append(", gender=").append(this.gender).append("}");
        return sb.toString();
    }
}
