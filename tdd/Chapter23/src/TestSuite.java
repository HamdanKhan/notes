import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamdan on 12/31/14.
 */
public class TestSuite {

    private List<TestCase> testCases = new ArrayList<TestCase>();

    public void add(TestCase testCase){
        testCases.add(testCase);
    }

    public void run(TestResult result){
        for(TestCase testCase : testCases){
            testCase.run(result);
        }
    }
}
