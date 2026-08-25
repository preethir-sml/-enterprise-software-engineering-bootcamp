package backend.examples.solid.refactored;

public class Order {
    private String product;
    private double amount;
    public Order(String product, double amount) {
        this.product = product;
        this.amount = amount;
    }
    public String getProduct() {
        return product;
    }
    public double getAmount() {
        return amount;
    }
}