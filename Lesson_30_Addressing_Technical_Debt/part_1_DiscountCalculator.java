public class DiscountCalculator {
    public double calculateFinalPrice(double originalPrice) {
        double discount = 0.10; // Using a hard-coded discount for quick calculation
        return originalPrice - (originalPrice * discount);
    }
}
