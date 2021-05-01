package co.com.mprd.sales.domain;

public class Order {
    // 1. attribs
    private final int orderId;
    private Product products[];
    private int productsCounter;
    private static int orderCounter;
    private final static int MAX_PRODUCTS = 10;
    
    // 2. default constructor
    // This also MUST initilize the array with the fixed size
    public Order() {
        this.orderId = ++Order.orderCounter;
        this.products = new Product[Order.MAX_PRODUCTS];
    }
    
    // 3. methods - getters and setters are not here
    public void addProduct(Product products) {
        // Validate quantity of products
        if (this.productsCounter <= Order.MAX_PRODUCTS){
            this.products[productsCounter++] = products;
        } else {
            System.out.println("The number of products is exceeded: " + Order.MAX_PRODUCTS);
        }
    }
    
    public double calculateTotal() {
        return 0.0; // Pending
    }
    
    public void showOrder() {
        // Pending
    }
}
