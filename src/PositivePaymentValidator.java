public class PositivePaymentValidator implements PaymentValidator {
    @Override
    public boolean validate(Payment payment) {
        return false;
    }
}
