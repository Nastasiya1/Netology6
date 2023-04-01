package accounts;

import accepters.MoneyTarget;

public abstract class Account implements MoneyTarget {
    protected String name;
    protected long balance;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Account(long balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public abstract boolean pay(long amount);

    public abstract boolean add(long amount);

    public boolean transfer(Account accountTo, int amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        }
        return false;
    }

    public boolean accept(int money) {
        return add(money);
    }
}