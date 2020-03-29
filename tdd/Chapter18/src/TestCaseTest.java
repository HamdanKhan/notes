
/**
 * Created by Hamdan on 12/30/14.
 */
public class TestCaseTest {

    public void testRunning(){
        WasRun test= new WasRun("testMethod");
        assert !test.getWasRun();
        test.run();
        assert test.getWasRun();
    }

    public static void main(String args[]){
        (new TestCaseTest()).testRunning() ;
    }
}
