public class OfferCalculator {
    private final double discount;

    public OfferCalculator(double discount) {
        this.discount = discount;
    }

    public double applyOffer(double originalPrice) {
        return originalPrice - (originalPrice * discount);
    }
}
