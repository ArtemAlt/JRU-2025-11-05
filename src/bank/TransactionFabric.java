package bank;

public class TransactionFabric {

    public Transaction createTransaction(BankAccount from, BankAccount to, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (from.getBalance() - amount < 0) {
            throw new IllegalArgumentException("Not enough balance");
        }
        return new Transaction(from, to, amount);
    }
}
