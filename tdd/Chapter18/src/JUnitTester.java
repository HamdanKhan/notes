import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNull;

/**
 * Created by hamdan on 12/30/14.
 */
public class JUnitTester {

    private String state = null;

    @Before
    public void beforeTest(){
        assertNull(state);
        state = "Before Run";
    }

    @Test
    public void test(){
        assertEquals(state, "Before Run");
        state = "Test Run";
    }

    @After
    public void after(){
        assertEquals(state,"Test Run");
        state = null;
    }
}
