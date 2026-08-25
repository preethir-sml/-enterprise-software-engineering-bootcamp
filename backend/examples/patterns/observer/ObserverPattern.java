package backend.examples.patterns.observer;
import java.util.ArrayList;
import java.util.List;
interface Restaurant {
    void update(OrderCreated order);
}

class OrderCreated {
    private String product;
    public OrderCreated(String product) {
        this.product = product;
    }
    public String getProduct() {
        return product;
    }
}
class EmailService implements Restaurant {
    public void update(OrderCreated order) {
        System.out.println(
            "Customer placed an order for "+ order.getProduct()+ " and email sent to customer"
        );
    }
}
class AnalyticsService implements Restaurant {
    public void update(OrderCreated order) {
        System.out.println(
            "Order for "+ order.getProduct()+ " recorded in analytics"
        );
    }
}
class NotificationService implements Restaurant {
    public void update(OrderCreated order) {
        System.out.println("Notification sent for "+ order.getProduct()
        );
    }
}
class OrderService {
    private List<Restaurant> subscribers = new ArrayList<>();
    public void subscribe(Restaurant restaurant) {
        subscribers.add(restaurant);
    }
    public void createOrder(String product) {
        OrderCreated order = new OrderCreated(product);
        System.out.println("Order created!");
        for (Restaurant subscriber : subscribers) {
            subscriber.update(order);
        }
    }
}
public class ObserverPattern {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.subscribe(new EmailService());
        orderService.subscribe(new AnalyticsService());
        orderService.subscribe(new NotificationService());
        orderService.createOrder("Pizza");
    }
}