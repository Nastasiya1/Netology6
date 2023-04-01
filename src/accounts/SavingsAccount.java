package accounts;

public class SavingsAccount extends Account {
    private long minimumBalance;

    public SavingsAccount(long balance, String name, long minimumBalance) {
        super(balance, name);
        this.minimumBalance = minimumBalance;
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