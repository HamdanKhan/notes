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

    public void run(TestResult result){
        try {
            result.testStarted();
            setUp();
            Method method = this.getClass().getDeclaredMethod(this.name);
            method.invoke(this);

        } catch (NoSuchMethodException e) {
            //e.printStackTrace();
            result.testFailed();
        } catch (InvocationTargetException e) {
            //e.printStackTrace();
            result.testFailed();
        } catch (IllegalAccessException e) {
            //e.printStackTrace();
            result.testFailed();
        } catch (Exception e) {
            result.testFailed();
        } finally {
            tearDown();
        }
    }
}
