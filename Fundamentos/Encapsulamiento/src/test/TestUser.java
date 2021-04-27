package test;

import java.util.Scanner;
import dominio.User;

public class TestUser {
    public static void main(String[] args) {
        // 1. creating object of Scanner class
        Scanner scanner = new Scanner(System.in);
        
        // 2. creating object of User class
        User user1 = new User(0001, "Andrew", true);
        System.out.println("DEFAULT VALUES");
        
        // 3. printing default values
        //System.out.println("user1.getId() = " + user1.getId());
        //System.out.println("user1.getName() = " + user1.getName());
        //System.out.println("user1.isStatus() = " + user1.isStatus());
        
        // 3v2.0v printing def. values with toString() method
        System.out.println(user1); // println() detects toString()
        
        // 4. asking for some info
        System.out.println("");
        System.out.println("MODIFIED VALUES");
        System.out.print("Insert id: ");
        user1.setId(Integer.parseInt(scanner.nextLine()));
        System.out.print("Insert name: ");
        user1.setName(scanner.nextLine());
        System.out.print("Insert status (true/false): ");
        user1.setStatus(Boolean.parseBoolean(scanner.nextLine()));
        
        // 5. returning with new info
        //System.out.println("user1.getId() = " + user1.getId());
        //System.out.println("user1.getName() = " + user1.getName());
        //System.out.println("user1.isStatus() = " + user1.isStatus());
        
        // 5v2.0 returning with toString() method
        System.out.println(user1.toString());
    }
}