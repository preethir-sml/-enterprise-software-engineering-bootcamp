public class OrderService {

    public void createOrder(String product, double amount) {
        System.out.println("Creating order for: " + product);
        System.out.println("Processing payment of ₹" + amount);
        System.out.println("Sending order confirmation email");
        System.out.println("Saving order to database");
    }
}