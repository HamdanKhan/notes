/**
 * Created by hamdan on 12/30/14.
 */
public class WasRun extends TestCase{

    private String log;

    public WasRun(String name){
        super(name);
    }

    public String getLog(){
        return log;
    }

    @Override
    public void setUp(){
        log = "setUp ";
    }

    public void testMethod(){
       log = log + "testMethod ";
    }

    public void testBrokenMethod() throws Exception{
        throw new Exception("Broken Method");
    }

    @Override
    public void tearDown() {
        log = log + "tearDown ";
    }
}
