package backend.examples.architecture.ecommerce;
import java.util.List;
public class Order {
    private int orderId;
    private List<Product> products;
    private Customer customer;
    private Payment payment;
    private Shipment shipment;
    public Order(int orderId, List<Product> products, Customer customer, Payment payment, Shipment shipment) {
        this.orderId = orderId;
        this.products = products;
        this.customer = customer;
        this.payment = payment;
        this.shipment = shipment;;
    }
}
