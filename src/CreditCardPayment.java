class CreditCardPayment implements PaymentMethod, Refundable {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        // Логика обработки платежа
        System.out.println("Обработка платежа по карте: " +
                cardNumber.substring(cardNumber.length() - 4));
        return amount > 0 && amount < 50000; // Примерная проверка
    }

    @Override
    public String getPaymentDetails() {
        return "Кредитная карта, окончание: " +
                cardNumber.substring(cardNumber.length() - 4);
    }

    @Override
    public boolean processRefund(double amount) {
        System.out.println("Возврат средств на карту");
        return amount <= getRefundLimit();
    }
}