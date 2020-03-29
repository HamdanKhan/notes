import junit.framework.TestCase;

/**
 * Created by hamdan on 12/26/14.
 */
public class DollarTest extends TestCase{

    public static void testMultiplication() {
        Dollar five= new Dollar(5);
        five.times(2);
        assertEquals(10 , five.amount);
    }
}
