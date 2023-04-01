package accounts;

public class CreditAccount extends Account {
    public CreditAccount(long balance, String name) {
        super(balance, name);
    }

    public boolean pay(long amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            if (balance <= 0) {
                return true;
            } else {
                balance -= amount;
                return false;
            }
        }
        return false;
    }
}
