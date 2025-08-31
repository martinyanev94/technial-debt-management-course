import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OfferCalculatorTest {
    @Test
    public void testApplyOffer() {
        OfferCalculator calculator = new OfferCalculator(0.10);
        double finalPrice = calculator.applyOffer(100.0);
        assertEquals(90.0, finalPrice, 0.01);
    }
}
