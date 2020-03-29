
/**
 * Created by Hamdan on 12/30/14.
 */
public class TestCaseTest {

    public void testTemplateMethod(){
        WasRun test= new WasRun("testMethod");
        test.run();
        assert("setUp testMethod tearDown ".equals(test.getLog()));
    }

    public void testResult(){
        WasRun test = new WasRun("testMethod");
        TestResult result= test.run();
        assert("1 run, 0 failed".equals(result.summary()));

    }

    public void testFailedResult(){
        WasRun test= new WasRun("testBrokenMethod");
        TestResult result= test.run();
        assert("1 run, 1 failed".equals(result.summary()));
    }

    public void testFailedResultFormatting(){
        TestResult result= new TestResult();
        result.testStarted();
        result.testFailed();
        assert("1 run, 1 failed" == result.summary());
    }

    public static void main(String args[]){
        TestCaseTest testCaseTest = new TestCaseTest();
        testCaseTest.testTemplateMethod() ;
        testCaseTest.testResult() ;
        testCaseTest.testFailedResult(); //"We'll put this test on the shelf for the moment."
        testCaseTest.testFailedResultFormatting();
        System.out.println("Done");//Just for sanity.
    }
}
