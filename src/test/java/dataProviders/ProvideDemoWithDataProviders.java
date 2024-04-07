package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProvideDemoWithDataProviders {
    @DataProvider(name = "mathOperations")
    public Object[][] getDataForDataProvider(){
        return new Object[][]{
            {22,23,"sum"},
            {2,3,"multiply"}
        };
    }

    @Test(dataProvider = "mathOperations")
    public void operateWithMathFunctions(int num1, int num2, String operations){
        int result;
        switch (operations){
            case "sum":
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case "multiply":
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            default:
                System.out.println("There wasn't data provided for math operations.");
        }
    }

    @Parameters({"fullName"})
    @Test()
    public void provideParamDemo(String name){
        System.out.println("Greetings from " + name);
    }
}
