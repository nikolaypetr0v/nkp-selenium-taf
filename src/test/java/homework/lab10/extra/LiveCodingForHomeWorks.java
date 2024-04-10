package homework.lab10.extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LiveCodingForHomeWorks {
    @Test()
    public void verifyTheUserCanSumTwoNumbers(double num1, double num2, String mathOperation ){

        double firstProvidedNumber = 0;
        double secondProvidedNumber = 0;
        String providedMathOperation = "";

        double expectedResult = 0;
        double actualResult = firstProvidedNumber + secondProvidedNumber;

        //The Automation script to verify that expected result is equal to actual result.
        Assert.assertEquals(actualResult,expectedResult);
    }
}
