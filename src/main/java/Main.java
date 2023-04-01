import accounts.SavingsAccount;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.Account;
import clients.Client;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(100000, "savingsAccount", 50000);
        Account checkingAccount = new CheckingAccount(10000, "checkingAccount");
        Account creditAccount = new CreditAccount(-20000, "creditAccount");

        System.out.println(savingsAccount.transfer(checkingAccount, 10000));
        System.out.println(savingsAccount.getBalance() + " " + checkingAccount.getBalance());

        System.out.println(checkingAccount.transfer(savingsAccount, 61000));
        System.out.println(checkingAccount.getBalance() + " " + savingsAccount.getBalance());

        System.out.println(creditAccount.transfer(savingsAccount, 10000));
        System.out.println(creditAccount.getBalance() + " " + savingsAccount.getBalance());

        System.out.println(savingsAccount.transfer(creditAccount, 41000));
        System.out.println(savingsAccount.getBalance() + " " + creditAccount.getBalance());

        Client ivanov = new Client("Ivanov", new Account[1]);
        ivanov.add(new CreditAccount(-1000, "creditAccount"));
        System.out.println(ivanov.accept(2000));

        Client petrov = new Client("Petrov", new Account[1]);
        petrov.add(new CheckingAccount(10000, "checkingAccount"));
        System.out.println(petrov.accept(5000));

        Account account = new SavingsAccount(150000, "savingsAccount", 50000);
        System.out.println(account.accept(3000));

        Account account1 = new CreditAccount(-60000, "creditAccount1");
        System.out.println(account1.accept(100000));
    }
}