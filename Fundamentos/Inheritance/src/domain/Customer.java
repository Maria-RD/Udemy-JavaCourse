package domain;

import java.util.Date;

public class Customer extends Persona {
    // 1. creating private and static attribs
    private int customerId;
    private Date signUpDate;
    private boolean vipCustomer;
    private static int customerCounter;
    
    // 2. creating constructor with some default args
    public Customer(String name, boolean vipCustomer, char genre, int age, String address) {
        super(name);
        Date date = new Date(); // creating object of type Date
        this.signUpDate = date; // setting this object to SignUpDate
        this.customerId = ++Customer.customerCounter;
        this.vipCustomer = vipCustomer;
        this.genre = genre;
        this.age = age;
        this.address = address;
    }
    
    // 3. getters and setters
    // 3.1. customerId - just the getter, since setter is already defined
    public int getCustomerId() {
        return this.customerId;
    }
    
    // 3.2. signUpDate - idem to customerId
    public Date getSignUpDate() {
        return this.signUpDate;
    }
    
    // 3.3. vipCustomer
    public boolean isVipCustomer() {
        return this.vipCustomer;
    }
    
    public void setVipCustomer(boolean vipCustomer) {
        this.vipCustomer = vipCustomer;
    }
    // 3.4. customerCounter - is not necessary, since it's setted up in the constructor
    
    // 4. toString() method - overriding method from the inherited one
    @Override
    public String toString() {
        // creating object of type StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: {customerId=").append(this.customerId);
        sb.append(", name=").append(this.name);
        sb.append(", signUpDate=").append(this.signUpDate);
        sb.append(", vipCustomer=").append(this.vipCustomer);
        sb.append("}").append("\n").append(super.toString());
        return sb.toString();
    }
}

//idCustomer int
//signUpDate Date
//vipCustomer boolean

//customerCounter