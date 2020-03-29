import junit.framework.TestCase;

/**
 * Created by Hamdan on 12/26/14.
 *
 * Test case for Dollar class.
 */
public class DollarTest extends TestCase {

    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
