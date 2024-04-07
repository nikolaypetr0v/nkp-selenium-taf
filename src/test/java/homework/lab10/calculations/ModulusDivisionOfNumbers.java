package homework.lab10.calculations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ModulusDivisionOfNumbers {
    @DataProvider(name = "numbersProvider")
    public Object[][] getDataForDataProvider(){
        return new Object[][] {
                {12,3,0},
                {26,5,1},
                {15,5,2}
        };
    }

    @Test(dataProvider = "numbersProvider", groups = "modulus", suiteName = "CalculatorOperations")
    public void verifyUserCanMultiplyTwoDigits(double num1, double num2, double expectedResult){
        double firstProvidedNumber = num1;
        double secondProvidedNumber = num2;
        double expectedSumResult = expectedResult;

        //Actual logic of the test
        double actualSumResult = firstProvidedNumber % secondProvidedNumber;
        System.out.println("The modulus result of number 1: " + firstProvidedNumber + " and number 2: " + secondProvidedNumber + " is: " + actualSumResult);

        Assert.assertEquals(actualSumResult,expectedSumResult);
    }
}
