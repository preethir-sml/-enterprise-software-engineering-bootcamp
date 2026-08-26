package backend.examples.patterns.observer;
import java.util.ArrayList;
import java.util.List;
interface Subscriber {
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
class EmailService implements Subscriber {
    public void update(OrderCreated order) {
        System.out.println(
            "Email sent for " + order.getProduct()
        );
    }
}
class AnalyticsService implements Subscriber {
    public void update(OrderCreated order) {
        System.out.println(
            "Analytics updated for " + order.getProduct()
        );
    }
}
class NotificationService implements Subscriber {
    public void update(OrderCreated order) {
        System.out.println(
            "Notification sent for " + order.getProduct()
        );
    }
}
class OrderService {
    private List<Subscriber> subscribers =
            new ArrayList<>();
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void createOrder(String product) {
        OrderCreated order =
                new OrderCreated(product);
        System.out.println("Order created!");
        for (Subscriber subscriber : subscribers) {
            subscriber.update(order);
        }
    }
}
public class ObserverPattern {
    public static void main(String[] args) {
        OrderService orderService =
                new OrderService();
        orderService.subscribe(new EmailService());
        orderService.subscribe(new AnalyticsService());
        orderService.subscribe(
                new NotificationService()
        );
        orderService.createOrder("Pizza");
    }
}