package test;

import domain.Persona;
import domain.Employee;
import domain.Customer;

public class TestInheritance {
    public static void main(String[] args) {
        // 1. creating object of type Employee wth no params. - it inherites from Persona too!
        Employee employee1 = new Employee("Juan", 1800000.00);
        
        // 1.1. printing the object created
        System.out.println(employee1);
        
        // 2. creating object of type Customer
        Customer customer1 = new Customer("MariaP", true, 'f', 15, "Calle 1 # 1b-1");
        
        // 2.1. printing child class inherited from Persona
        System.out.println();
        System.out.println(customer1);
        
        // 2. creating object of type Customer
        Customer customer2 = new Customer("Pedro", false, 'm', 20, "Carrera 5 # 5-55");
        
        // 2.1. printing child class inherited from Persona
        System.out.println();
        System.out.println(customer2);
        
        // 3. creating object of type Persona
        Persona persona1 = new Persona();
    }
}