package accounts;

public class CheckingAccount extends Account {
    private int minimumBalance;

    public CheckingAccount(long balance, String name) {
        super(balance, name);
        this.minimumBalance = 0;
    }

    public boolean pay(long amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            if (balance >= minimumBalance) {
                return true;
            } else {
                balance += amount;
                return false;
            }
        }
        return false;
    }

    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
}