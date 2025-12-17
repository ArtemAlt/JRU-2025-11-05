public interface Refundable {

    boolean processRefund(double amount);

    default double getRefundLimit() {
        return 10000.0;
    }
}
