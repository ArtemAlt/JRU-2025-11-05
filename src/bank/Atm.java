package bank;

import java.util.UUID;

public class Atm {
    private final UUID id;
    private BankAccount atmAccount;
    private BankAccount currentUser;

    public Atm() {
        this.id = UUID.randomUUID();
        this.atmAccount = new BankAccount(50000.0, "ATM");
    }

    public void authentification(BankAccount currentUser) {
        this.currentUser = currentUser;
    }

    public Double putCash(Double cash) {
        TransactionFabric transactionFabric = new TransactionFabric();
        Transaction transaction = transactionFabric.createTransaction(atmAccount, currentUser, cash);
        return transaction.execute();
    }

    public Double getCash(Double cash) {
        TransactionFabric transactionFabric = new TransactionFabric();
        Transaction transaction = transactionFabric.createTransaction(currentUser, atmAccount, cash);
        return transaction.execute();
    }
}
