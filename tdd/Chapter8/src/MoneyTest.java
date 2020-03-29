import junit.framework.TestCase;

/**
 * Created by hamdan on 12/26/14.
 */
public class MoneyTest extends TestCase {


    public void testMultiplication() {
        Dollar five = Money.dollar(5); // originally - Money five = Money.dollar(5); but five.times will not work.
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    public void testFrancMultiplication() {
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

}
