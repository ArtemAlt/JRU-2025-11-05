public interface PaymentMethod {
    // Константы
    String CURRENCY = "RUB";

    boolean processPayment(double amount);

    String getPaymentDetails();

    // default метод
    default void printReceipt(double amount) {
        System.out.println("=== Квитанция ===");
        System.out.println("Сумма: " + amount + " " + CURRENCY);
        System.out.println("Метод: " + getPaymentDetails());
        System.out.println("Статус: " + (processPayment(amount) ? "Успешно" : "Ошибка"));
    }
}
