import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by hamdan on 12/30/14.
 */
public class WasRun extends TestCase{

    private Boolean wasRun = Boolean.FALSE;
    private Boolean wasSetUp = Boolean.FALSE;

    public WasRun(String name){
        super(name);
        this.wasRun = Boolean.FALSE;
    }

    public Boolean getWasRun() {
        return wasRun;
    }

    public void setUp(){
        wasRun = Boolean.FALSE;
        wasSetUp = Boolean.TRUE;
    }

    public void testMethod(){
       wasRun = Boolean.TRUE;
    }

    public Boolean getWasSetUp() {
        return wasSetUp;
    }
}
