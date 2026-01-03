import java.math.BigDecimal;

public enum AccountType {
    CREDIT(true, 100),
    DEBIT(false, 10);

    private Boolean isNegative;
    private BigDecimal fee;

    AccountType(boolean b, int fee) {
    }
}
