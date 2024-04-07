package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {
    @Test
    public void hardAssertionDemo(){
        int a = 5;
        int b = 22;

        Assert.assertTrue(a<b);
    }
}
