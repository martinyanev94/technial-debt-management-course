interface PaymentProcessor {
    void processPayment(double amount);
}
class ThirdPartyPaymentService {
    public void makePayment(String currency, double amount) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }
}
class PaymentAdapter implements PaymentProcessor {
    private ThirdPartyPaymentService paymentService;

    public PaymentAdapter(ThirdPartyPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment(double amount) {
        paymentService.makePayment("USD", amount);
    }
}
