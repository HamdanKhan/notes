import junit.framework.TestCase;

/**
 * Created by Hamdan on 12/26/14.
 *
 * Test case for Dollar class.
 */
public class DollarTest extends TestCase {

    public void testMultiplication() {
        Dollar five= new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
}
