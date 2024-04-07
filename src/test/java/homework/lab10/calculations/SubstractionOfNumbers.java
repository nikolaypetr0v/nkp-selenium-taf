package homework.lab10.calculations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubstractionOfNumbers {
    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {23,22,1},
                {5,3,2},
                {15,13,5}
        };
    }

    @Test(dataProvider = "numbersProvider", groups = "subtraction", suiteName = "CalculatorOperations")
    public void verifyUserCanSubtractionTwoDigits(double num1, double num2, double expectedResult){
        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = firstProvidedNumber - secondProvidedNumber;
        System.out.println("The subtraction of number 1: " + firstProvidedNumber + " and number 2: "+ secondProvidedNumber +" is: " + actualSumResult);

        Assert.assertEquals(actualSumResult,expectedSumResult);
    }
}
