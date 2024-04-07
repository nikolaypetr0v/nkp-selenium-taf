package homework.lab10.calculations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionOfNumbers {
    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {9,3,3},
                {15,3,5},
                {25,3,5}
        };
    }

    @Test(dataProvider = "numbersProvider", groups = "divide", suiteName = "CalculatorOperations")
    public void verifyUserCanDivideTwoDigits(double num1, double num2, double expectedResult){
        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = firstProvidedNumber / secondProvidedNumber;
        System.out.println("The division result of number 1: " + firstProvidedNumber + " and number 2: " + secondProvidedNumber + " is: " + actualSumResult);

        Assert.assertEquals(actualSumResult,expectedSumResult);
    }
}
