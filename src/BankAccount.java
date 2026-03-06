public class BankAccount {
    private Integer accountNumber;
    private double balance;
    private boolean isLock = true;

    public BankAccount(Integer accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }
}
