import accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {

    @Test
    void pay() {
        SavingsAccount savingsAccount = new SavingsAccount(50000, "savingsTest", 10000);
        savingsAccount.pay(20000);

        long balanceExpected = 30000;
        long balanceActual = savingsAccount.getBalance();
        Assertions.assertEquals(balanceExpected, balanceActual);
    }
}