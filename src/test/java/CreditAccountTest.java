import accounts.CreditAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditAccountTest {

    @Test
    void add() {
        CreditAccount creditAccount = new CreditAccount(-10000, "creditTest");
        Assertions.assertFalse(creditAccount.add(15000));
    }
}