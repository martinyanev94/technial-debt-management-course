public class DiscountCalculator {
    private final double discount;

    public DiscountCalculator(double discount) {
        this.discount = discount;
    }

    public double calculateFinalPrice(double originalPrice) {
        return originalPrice - (originalPrice * discount);
    }
}
