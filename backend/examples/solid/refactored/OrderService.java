package backend.examples.solid.refactored;
public class OrderService {
    private PaymentService paymentService;
    private EmailService emailService;
    private OrderRepository orderRepository;
    public OrderService(
            PaymentService paymentService,
            EmailService emailService,
            OrderRepository orderRepository) {
        this.paymentService = paymentService;
        this.emailService = emailService;
        this.orderRepository = orderRepository;
    }
    public void createOrder(String product, double amount) {
        Order order = new Order(product, amount);
        paymentService.processPayment(order);
        emailService.sendConfirmation(order);
        orderRepository.save(order);
    }
}