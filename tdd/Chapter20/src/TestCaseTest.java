
/**
 * Created by Hamdan on 12/30/14.
 */
public class TestCaseTest {

    public void testTemplateMethod(){
        WasRun test= new WasRun("testMethod");
        test.run();
        assert("setUp testMethod tearDown ".equals(test.getLog()));
    }

    public static void main(String args[]){
        (new TestCaseTest()).testTemplateMethod() ;
        System.out.println("Done");//Just for sanity.
    }
}
