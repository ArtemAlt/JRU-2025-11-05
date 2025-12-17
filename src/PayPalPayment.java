class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("PayPal платеж с email: " + email);
        return true;
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal, email: " + email;
    }
}