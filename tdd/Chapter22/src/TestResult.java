/**
 * Created by hamdan on 1/4/15.
 */
public class TestResult {

    Integer runCount;
    Integer errorCount;

    public TestResult(){
        runCount = 0;
        errorCount = 0;
    }

    public void testStarted(){
        runCount++;
    }

    public void testFailed() {
        errorCount++;
    }

    public String summary(){
        return runCount + " run, "+errorCount+" failed";
    }
}
