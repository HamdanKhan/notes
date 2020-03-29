import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Hamdan Khan on 1/1/2015.
 */
public class SumPlusMoneyTest {

    @Test
    public void testSumPlusMoney() {
        Expression fiveBucks= Money.dollar(5);
        Expression tenFrancs= Money.franc(10);
        Bank bank= new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum= new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Money result= bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    public void testSumTimes() {
        Expression fiveBucks= Money.dollar(5);
        Expression tenFrancs= Money.franc(10);
        Bank bank= new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum= new Sum(fiveBucks, tenFrancs).times(2);
        Money result= bank.reduce(sum, "USD");
        assertEquals(Money.dollar(20), result);
    }

    @Test
    public void testPlusSameCurrencyReturnsMoney() {
        Expression sum= Money.dollar(1).plus(Money.dollar(1));
        assertTrue(sum instanceof Expression);// Not Money
    }
}
