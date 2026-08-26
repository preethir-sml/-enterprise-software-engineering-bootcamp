package backend.examples.patterns.factory;
interface Payment {
    void pay();
}
class StripePayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Stripe");
    }
}
class PayPalPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using PayPal");
    }
}
class RazorPayPayment implements Payment {

    public void pay() {
        System.out.println("Payment made using RazorPay");
    }
class PaymentFactory {
    public static Payment createPayment(String type) {
        if (type.equalsIgnoreCase("Stripe")) {
            return new StripePayment();
        } else if (type.equalsIgnoreCase("PayPal")) {
            return new PayPalPayment();
        } else if (type.equalsIgnoreCase("RazorPay")) {
            return new RazorPayPayment();
        }
        throw new IllegalArgumentException("Invalid payment type");
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        Payment payment =
                PaymentFactory.createPayment("Stripe");
        payment.pay();
    }
}