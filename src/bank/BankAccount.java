package bank;

import java.util.UUID;

public class BankAccount {
    private final UUID id;
    private Double balance;
    private final String owner;

    public BankAccount(String owner) {
        this.id = generateUniqAccountId();
        this.owner = owner;
        this.balance = 0.0;
    }

    public BankAccount(Double balance, String owner) {
        this.id = generateUniqAccountId();
        this.balance = validate(balance);
        this.owner = owner;
    }

    public Double getBalance() {
        return this.balance;
    }

    void setBalance(Double balance) {
        this.balance = balance;
    }

    private UUID generateUniqAccountId() {
        return UUID.randomUUID();
    }

    private Double validate(Double balance) {
        if (balance < 0.0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        return balance;
    }
}
