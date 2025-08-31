/**
 * Calculator for applying discounts on prices.
 */
public class OfferCalculator {
    private final double discount;

    /**
     * Creates an OfferCalculator with a specified discount.
     *
     * @param discount the discount rate between 0 and 1.
     */
    public OfferCalculator(double discount) {
        this.discount = discount;
    }

    /**
     * Applies the discount to the original price.
     *
     * @param originalPrice the original price before discount
     * @return the final price after applying the discount
     */
    public double applyOffer(double originalPrice) {
        return originalPrice - (originalPrice * discount);
    }
}
