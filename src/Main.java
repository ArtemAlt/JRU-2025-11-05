import bank.Atm;
import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount("Vasya");
        Atm atm = new Atm();

        atm.authentification(user);
        atm.getCash(100.0);

    }
}