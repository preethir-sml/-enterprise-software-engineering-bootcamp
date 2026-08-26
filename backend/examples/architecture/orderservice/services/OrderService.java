package backend.examples.architecture.orderservice.services;

import backend.examples.architecture.orderservice.models.Order;
import backend.examples.architecture.orderservice.repositories.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public void createOrder(String product, int id) {
        Order order = new Order(product, id);
        System.out.println("Order created: " + product);
        orderRepository.save(order);
    }
}
