package clients;

import accepters.MoneyTarget;
import accounts.Account;

public class Client implements MoneyTarget {
    protected String name;
    protected Account[] accounts;

    public Client(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет! :(");
    }

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    public boolean accept(int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].add(money)) {
                return true;
            }
        }
        return false;
    }
}