import java.util.Scanner;

public class XYZ {

    // Method to calculate the total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5]; // Array to store 5 products

        // a. Accept 5 product details from the user
        System.out.println("Enter details of 5 products (pid, price, quantity): ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // b. Find the pid of the product with the highest price
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                maxPricePid = products[i].getPid();
            }
        }

        System.out.println("The Product ID with the highest price is: " + maxPricePid);

        // c. Calculate total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("The total amount spent on all products is: " + totalAmount);

        sc.close();
    }
}
