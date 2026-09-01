package backend.examples.architecture.ecommerce;

import java.util.List;

public class Cart {
    private int cartId;
    private List<Product> products;
    public Cart(int cartId, List<Product> products) {
        this.cartId = cartId;
        this.products = products;
    }
    
}
