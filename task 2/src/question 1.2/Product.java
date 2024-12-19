public class Product {
    private int pid;        // Product ID
    private double price;   // Price of product
    private int quantity;   // Quantity of product

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for accessing private properties
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
