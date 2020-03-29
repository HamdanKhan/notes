import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by hamdan on 12/28/14.
 */
public class MoneyTest {

    @Test
    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(Money.franc(10)));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }


}
