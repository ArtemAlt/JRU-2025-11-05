package bank;

class Transaction {
    private final BankAccount from;
    private final BankAccount to;
    private final double amount;

    Transaction(BankAccount from, BankAccount to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Double execute() {
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        return amount;
    }

}
