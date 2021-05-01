package co.com.mprd.sales.domain;

public class Product {
    // 1. attribs
    private final int productId;
    private String name;
    private double price;
    private static int productCounter;
    
    // 2. overloading constructors
    // 2.1. default constructor
    private Product() {
        this.productId = ++Product.productCounter;
    }
    
    // 2.2. overloaded method
    public Product(String name, double price) {
        this(); // calling the default constructor
        this.name = name;
        this.price = price;
    }
    
    // 3. getters and setters
    // 3.1. productId
    public int getProductId() {
        return this.productId;
    }
    
    // 3.2. name
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // 3.3. price
    public double getPrice() {
        return this.price;
    }
    
    // toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product: {productId=").append(this.productId);
        sb.append(", name=").append(this.name);
        sb.append(", price=").append(this.price).append("}");
        return sb.toString();
    }
}
