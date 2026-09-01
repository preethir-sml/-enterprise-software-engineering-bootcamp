package backend.examples.architecture.ecommerce;

public class Customer {
    private int customerId;
    private String customerName;
    private String email;
    public Customer(int customerId, String customerName, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }
}
