package backend.examples.architecture.orderservice.models;

public class Order {
    private String product;
    private int id;
    public Order(String product,int id){
        this.product=product;
        this.id=id;
    }
    public String getProduct() {
        return product;
    }
    public int getId() {
        return id;
    }
}
