class PaymentApp {
    public static void main(String[] args) {
        ThirdPartyPaymentService thirdPartyService = new ThirdPartyPaymentService();
        PaymentProcessor paymentProcessor = new PaymentAdapter(thirdPartyService);

        paymentProcessor.processPayment(100.0); // Uses adapter to process payment
    }
}
