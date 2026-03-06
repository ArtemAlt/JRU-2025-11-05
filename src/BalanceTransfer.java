public class BalanceTransfer {


    public synchronized void transfer(BankAccount from, BankAccount to, double amount)  {
        BankAccount first = from.getAccountNumber() < to.getAccountNumber() ? from : to;
        BankAccount second = from.getAccountNumber() > to.getAccountNumber() ? from : to;
        synchronized (first) {
            synchronized (second) {
                double balance = from.getBalance();
                double balance1 = balance - amount;
                double balance2 = to.getBalance() + amount;
                from.setBalance(balance1);
                to.setBalance(balance2);
            }
        }
    }
}
