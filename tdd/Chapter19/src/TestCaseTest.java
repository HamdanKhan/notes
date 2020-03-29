
/**
 * Created by Hamdan on 12/30/14.
 */
public class TestCaseTest extends TestCase{

    WasRun test = null;

    public TestCaseTest(String name) {
        super(name);
    }

    public void setUp(){
        test= new WasRun("testMethod");
    }

    public void testRunning(){
        test.run();
        assert test.getWasRun();
    }
    public void testSetUp(){
        test.run();
        assert(test.getWasSetUp());
    }

    public static void main(String args[]){
        (new TestCaseTest("testRunning")).run() ;
        (new TestCaseTest("testSetUp")).run() ;
        System.out.println("Done");//Just for sanity.
    }
}
