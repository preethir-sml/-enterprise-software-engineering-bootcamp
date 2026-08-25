
package backend.examples.solid.refactored;
public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        EmailService emailService = new EmailService();
        OrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(paymentService,emailService,orderRepository);
        orderService.createOrder("Laptop", 50000);
    }
}