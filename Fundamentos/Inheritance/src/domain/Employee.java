package domain;

public class Employee extends Persona {

    // 1. defining private (bd there aren't more child classes) and a static counter attrib
    private int idEmployee;
    private double salary;
    private static int employeeCounter;

    // 2. defining constructor of the Employee class with some default args
    // initializing with an arg of the parent class
    public Employee(String name, double salary) {
        super(name); // initializing parent constructor with 1 arg
        this.name = name;
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    // 3. defining getters and setters
    // 3.1. getter of idEmployee - setter is not necessary because it is already
    // initialized in the Employee() constructor
    public int getIdEmployee() {
        return this.idEmployee;
    }

    // 3.2 salary
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 4. overriding toString() inherited from the Persona class
    // by creating a new object of type StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{idEmployee=").append(this.idEmployee);
        sb.append(", name=").append(this.name);
        sb.append(", salary=").append(this.salary);
        sb.append("}\n");
        sb.append(super.toString()); // toString() de Persona usando "super"
        return sb.toString();
    }
}
