package backend.examples.architecture.orderservice.controllers;
import backend.examples.architecture.orderservice.repositories.OrderRepository;
import backend.examples.architecture.orderservice.services.OrderService;
public class OrderController {
    private OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    public void createOrder() {
        orderService.createOrder("Pizza", 500);
    }
    public static void main(String[] args) {
        OrderRepository repository =new OrderRepository();
        OrderService service =new OrderService(repository);
        OrderController controller =new OrderController(service);
        controller.createOrder();
    }
}