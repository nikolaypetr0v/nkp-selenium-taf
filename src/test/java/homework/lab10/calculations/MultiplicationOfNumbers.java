package homework.lab10.calculations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationOfNumbers {
    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {3,3,9},
                {5,3,15},
                {6,2,16}
        };
    }

    @Test(dataProvider = "numbersProvider", groups = "multiply", suiteName = "CalculatorOperations")
    public void verifyUserCanMultiplyTwoDigits(double num1, double num2, double expectedResult){
        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = firstProvidedNumber * secondProvidedNumber;
        System.out.println("The multiply result of number 1: " + firstProvidedNumber + " and number 2: " + secondProvidedNumber + " is: " + actualSumResult);

        Assert.assertEquals(actualSumResult,expectedSumResult);
    }
}
