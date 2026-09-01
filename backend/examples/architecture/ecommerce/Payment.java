package backend.examples.architecture.ecommerce;

public class Payment {

    private int paymentId;
    private double amount;
    private String paymentMethod;
    private String status;

    public Payment(int paymentId, double amount, String paymentMethod, String status) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }
}