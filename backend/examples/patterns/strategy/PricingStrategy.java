package backend.examples.patterns.strategy;

interface Price {
    double getPrice(double price);
}

class RegularPrice implements Price {
    public double getPrice(double price) {
        System.out.println(
            "No Discount applied. It is Regular Price: " + price
        );
        return price;
    }
}

class MemberDiscount implements Price {
    public double getPrice(double price) {
        System.out.println(
            "Member discount applied. Final price: " + (price * 0.8)
        );
        return price * 0.8;
    }
}

class HolidayDiscount implements Price {
    public double getPrice(double price) {
        System.out.println(
            "Holiday discount applied. Final price: " + (price * 0.5)
        );
        return price * 0.5;
    }
}

public class PricingStrategy {
    private Price priceStrategy;
    public PricingStrategy(Price priceStrategy) {
        this.priceStrategy = priceStrategy;
    }
    public double getPrice(double price) {
        return priceStrategy.getPrice(price);
    }
}

class Main {
    public static void main(String[] args) {
        Price strategy = new HolidayDiscount();
        PricingStrategy pricing =
            new PricingStrategy(strategy);
        pricing.getPrice(1000);
    }
}