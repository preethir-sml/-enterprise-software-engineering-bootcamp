package backend.examples.solid.refactored;

public class EmailService {
    public void sendConfirmation(Order order) {
        System.out.println(
            "Sending confirmation email for "
            + order.getProduct()
        );
    }
}