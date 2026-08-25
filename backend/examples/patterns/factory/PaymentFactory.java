package backend.examples.patterns.factory;
interface Payment{
    void pay();
}
class StripePayment implements Payment {
    public void pay() {
        System.out.println("Amount paid using Stripe");
    }
}
class PayPalPayment implements Payment{
    public void pay(){
        System.out.println("Amount paid using PayPal");
    }
}
class RazorPayPayment implements Payment{
    public void pay(){
        System.out.println("Amount paid using RazorPay");
    }
}
public class PaymentFactory {
    public static Payment createPayment(String type){
        if(type.equalsIgnoreCase("StripePayment")){
            return new StripePayment();
        } else if(type.equalsIgnoreCase("PayPal")){
            return new PayPalPayment();
        } else if(type.equalsIgnoreCase("RazorPay")){
            return new RazorPayPayment();
        }
        throw new IllegalArgumentException("Invalid payment type: " + type);
    }
}
class Main{
    public static void main(String[] args){
        Payment p = PaymentFactory.createPayment("StripePayment");
        p.pay();
    }
}
