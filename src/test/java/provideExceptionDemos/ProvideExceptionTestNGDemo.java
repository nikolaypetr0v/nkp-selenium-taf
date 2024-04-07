package provideExceptionDemos;

import org.testng.annotations.Test;
import utils.TestFormating;

public class ProvideExceptionTestNGDemo extends TestFormating {
    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void provideExceptionDemoThatTestWillRunIfDeclaredExceptionIsProvided(){
        throw new ArrayIndexOutOfBoundsException("Passed");
    }
}
