import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hamdan on 12/29/14.
 */
public class BankTest {

    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank= new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result= bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }
}
