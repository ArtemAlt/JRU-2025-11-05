public class BankAccount {
    private final String username;
    private final String number;
    private double balance;

    public BankAccount(String username, String number, double initialBalance) {
        this.username = username;
        this.number = number;
        this.balance = initialBalance;
    }

    public BankAccount(String username, String number) {
        this.username = username;
        this.number = number;
        this.balance = 0;
    }

    public BankAccount() {
        this("NON", "NON");
    }

    public String getUsername() {
        return username;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public static boolean transfer(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

    public String info() {
        return "BankAccount{" +
                "username='" + username + '\'' +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
