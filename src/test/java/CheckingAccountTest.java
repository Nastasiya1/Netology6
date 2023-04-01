import accounts.CheckingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckingAccountTest {

    @Test
    void pay() {
        CheckingAccount checkingAccount = new CheckingAccount(20000, "testChecking");
        Assertions.assertTrue(checkingAccount.pay(1000));
    }
}