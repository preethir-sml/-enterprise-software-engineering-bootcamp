package backend.examples.solid.refactored;
public class PaymentService {
    public void processPayment(Order order) {
        System.out.println(
            "Processing payment of Rupees " + order.getAmount()
        );
    }
}