
/*
                - номер счёта
                - баланс
                - статус (активный, заблокирован)
                - лимиты
                - тип
*/

import java.math.BigDecimal;
import java.util.UUID;

public class Account implements EntityKey{
    private final String num;
    private BigDecimal balance; 
    private Boolean isBlocked;
    private AccountType type;   


    public Account (AccountType type) {
        this.num = generateAccountNumber();
        this.balance = new BigDecimal(0);
        this.isBlocked = false;
        this.type = type;
    }

    public void setBalance (BigDecimal newBalanse) {
        this.balance = newBalanse;
    }

    public void disableAccount() {
        this.isBlocked = true;
    }

    public void activateAccount() {
        this.isBlocked = false;
    }

    @Override
    public String getKey(){
        return num;
    }

    private String generateAccountNumber() {
        return "ACC_" + UUID.randomUUID()
        .toString()
        .substring(0, 8)
        .toUpperCase();
    }
}