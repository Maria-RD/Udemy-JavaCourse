package co.com.mprd.sales.test;

import co.com.mprd.sales.domain.Order;
import co.com.mprd.sales.domain.Product;

public class TestSales {

    public static void main(String[] args) {
        // 1. creating 12 objects of type Product
        Product product1 = new Product("Notebook Asus PC x507UF 8th Gen", 499.99);
        Product product2 = new Product("Notebook Msi Gt76 Titan 9th Gen", 1899.99);
        Product product3 = new Product("Netbook Noblex", 150.00);
        Product product4 = new Product("Netbook Bangho", 170.00);
        Product product5 = new Product("UHD monitor 24 inch", 296.99);
        Product product6 = new Product("HD monitor 18 inch", 78.97);
        Product product7 = new Product("RGB Gamer Mouse", 35.99);
        Product product8 = new Product("Generical mouse", 10.00);
        Product product9 = new Product("Notebook black case", 28.99);
        Product product10 = new Product("Notebook white case", 29.99);
        Product product11 = new Product("RGB Led lamp", 27.96);
        Product product12 = new Product("White led lamp", 18.99);

        // Printing created products
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);
        System.out.println(product6);
        System.out.println(product7);
        System.out.println(product8);
        System.out.println(product9);
        System.out.println(product10);
        System.out.println(product11);
        System.out.println(product12);

        // Creating an order
        System.out.println("");
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product8);
        order1.showOrder();

        // Creating an order
        System.out.println("");
        Order order2 = new Order();
        order2.addProduct(product1);
        order2.addProduct(product2);
        order2.addProduct(product3);
        order2.addProduct(product4);
        order2.addProduct(product5);
        order2.addProduct(product6);
        order2.addProduct(product7);
        order2.addProduct(product8);
        order2.addProduct(product9);
        order2.addProduct(product10);
        order2.addProduct(product11); // this line goes to the else statement
        order2.showOrder();

    }
}
