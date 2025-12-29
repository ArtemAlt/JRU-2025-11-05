import java.util.HashSet;
import java.util.Set;

public class PaymentService {
    private Set<String> accounts;

    PaymentService() {
        accounts = new HashSet<>();
    }

    public void processing(String account) throws NotFoundAccount {
        boolean contains = accounts.contains(account);
        if (!contains) {
            throw new NotFoundAccount("Not found account " + account);
        }
    }
}
