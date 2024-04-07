package homework.lab10.calculations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumOfNumbers {
    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {22,23,45},
                {2,3,5},
                {1,3,6}
        };
    }

    @Test(dataProvider = "numbersProvider", groups = "sum", suiteName = "CalculatorOperations")
    public void verifyUserCanSumTwoDigits(double num1, double num2, double expectedResult) {
        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = firstProvidedNumber + secondProvidedNumber;
        System.out.println("The sum of number 1: " + firstProvidedNumber + " and number 2: " + secondProvidedNumber + " is: " + actualSumResult);

        Assert.assertEquals(actualSumResult, expectedSumResult);
    }
}
