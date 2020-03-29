import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Hamdan Khan on 1/2/2015.
 */
public abstract class TestCase {

    protected String name = null;

    public TestCase(String name) {
        this.name=name;
    }

    abstract public void setUp();
    abstract public void tearDown();

    public TestResult run(){
        TestResult result = null;
        try {
            result = new TestResult();
            result.testStarted();
            setUp();
            Method method = this.getClass().getDeclaredMethod(this.name);
            method.invoke(this);
            tearDown();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return result;
    }
}
