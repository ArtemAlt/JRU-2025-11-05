import java.util.Objects;

@FunctionalInterface
public interface PaymentValidator {
    boolean validate(Payment payment);

//    default void log(String message) {
//        System.out.println(message);
//    }
//
//    String toString();
//    boolean equals(Object o);

    default PaymentValidator and(PaymentValidator next) {
        System.out.println("PaymentValidator and");
        return p -> this.validate(p) && next.validate(p);
    }

    default PaymentValidator or(PaymentValidator next) {
        System.out.println("PaymentValidator or");
        return payment -> this.validate(payment) || next.validate(payment);
    }

    static PaymentValidator notNull() {
        System.out.println("PaymentValidator notNull");
        return Objects::nonNull;
    }
}
