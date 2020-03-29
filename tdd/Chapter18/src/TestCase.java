import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Hamdan Khan on 1/2/2015.
 */
public class TestCase {

    protected String name = null;

    public TestCase(String name) {
        this.name=name;
    }

    public void run(){
        try {
            Method method = this.getClass().getDeclaredMethod(this.name);
            method.invoke(this);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
