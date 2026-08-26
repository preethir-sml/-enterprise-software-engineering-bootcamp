package backend.examples.patterns.strategy;
interface PricingStrategy {
    double calculatePrice(double price);
}
class RegularPricing implements PricingStrategy {
    public double calculatePrice(double price) {
        return price;
    }
}
class MemberDiscount implements PricingStrategy {
    public double calculatePrice(double price) {
        return price * 0.80;
    }
}
class HolidayDiscount implements PricingStrategy {
    public double calculatePrice(double price) {
        return price * 0.50;
    }
}
class PriceCalculator {
    private PricingStrategy strategy;
    public PriceCalculator(PricingStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculatePrice(double price) {
        return strategy.calculatePrice(price);
    }
}
public class StrategyPattern {
    public static void main(String[] args) {
        PricingStrategy strategy =
                new HolidayDiscount();
        PriceCalculator calculator =
                new PriceCalculator(strategy);
        double finalPrice =
                calculator.calculatePrice(1000);
        System.out.println("Final price: " + finalPrice);
    }
}