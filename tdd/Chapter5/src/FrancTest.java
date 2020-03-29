import junit.framework.TestCase;

/**
 * Created by hamdan on 12/26/14.
 */
public class FrancTest extends TestCase{

    public void testMultiplication() {
        Franc five= new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
