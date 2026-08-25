package backend.examples.solid.refactored;
public class OrderRepository {
    public void save(Order order) {
        System.out.println( "Saving order for "+ order.getProduct() + " to database");
    }
}