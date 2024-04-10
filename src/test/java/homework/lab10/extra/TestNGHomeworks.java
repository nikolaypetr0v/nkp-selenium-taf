package homework.lab10.extra;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGHomeworks {
    @DataProvider
    public Object[][] provideTestData () {
        return new Object[][] {
                {2, 3 , "Sum", 5}
        };
    }

    @Test(dataProvider = "provideTestData")
    public void verifyUserCanSumDigits(double firstNumber, double secondNumber, String mathOperation, double result) {
        double firstProvidedNumber = firstNumber;
        double secondProvidedNumber = secondNumber;

        String providedMathOperation = mathOperation;
        double actualResult = firstNumber+secondNumber;
        double expextedResult = result;

        Assert.assertNotEquals(actualResult,result);
    }
}
