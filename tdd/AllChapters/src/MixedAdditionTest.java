import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hamdan on 12/29/14.
 */
public class MixedAdditionTest {

    @Test
    public void testMixedAddition() {
        Expression fiveBucks= Money.dollar(5);
        Expression tenFrancs= Money.franc(10);
        Bank bank= new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result= bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);
    }
}
