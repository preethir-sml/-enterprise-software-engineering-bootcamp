package backend.examples.architecture.orderservice.repositories;
import backend.examples.architecture.orderservice.models.Order;

public class OrderRepository {
    public void save(Order order) {
        System.out.println("Order saved to database: " + order.getProduct());
    }
}
