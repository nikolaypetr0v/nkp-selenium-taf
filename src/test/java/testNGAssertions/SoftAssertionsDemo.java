package testNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsDemo {
    @Test
    public void provideTestNGSoftAssertionDemoCode(){
        // Create SoftAssert object
        SoftAssert softAssert = new SoftAssert();

        // Add all assertions
        softAssert.assertTrue(5 == 5);
        softAssert.assertFalse(5 < 4);

        // Validate all collected assertions
        softAssert.assertAll(); // If any assertion fails – this is the line where the code will stop its execution.
    }
}
