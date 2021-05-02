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
        if (this.productsCounter < Order.MAX_PRODUCTS){
            this.products[this.productsCounter++] = products;
        } else {
            System.out.println("The number of products is exceeded: " + Order.MAX_PRODUCTS);
        }
    }
    
    public double calculateTotal() {
        double total = 0.0;
        for (int i=0; i<this.productsCounter; i++) {
            //Product product = this.products[i];
            // total += product.getPrice();
            total += this.products[i].getPrice();
        }
        return total;
    }
    
    public void showOrder() {
        System.out.println("WELCOME TO PEAR STORE!\nDear customer. This is your order.\n\n" +
                "Order ID:" + this.orderId +
                "\nTotal of the order=" + this.calculateTotal() 
                + "\nChosen products:");
        for (int i = 0; i < this.productsCounter; i++) {
            System.out.println(this.products[i]);
        }
    }
}
