public class PaymentProcessor {
    private PaymentValidator paymentValidator;

    public PaymentProcessor(PaymentValidator paymentValidator) {
        this.paymentValidator = paymentValidator;
    }

    public boolean process(Payment payment) {
        if (paymentValidator.validate(payment)) {
            System.out.println("Payment valid");
            return true;
        }
        System.out.println("Payment invalid");
        return false;
    }
}
