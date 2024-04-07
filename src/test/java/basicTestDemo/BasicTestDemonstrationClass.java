package basicTestDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.TestFormating;

public class BasicTestDemonstrationClass extends TestFormating {
    @BeforeClass
    public void setUp() {
        provideFormatForTest("before class", "|");
        System.out.println("The chrome browser is up and running");
        System.out.println("Chrome settings are provided");
    }

    @BeforeMethod
    public void generateUserNameDataForLoginTestCases() {
        provideFormatForTest("BEFORE methoid", ">");
    }
    @AfterClass
    public void tearDown() {
        provideFormatForTest("AFTER CLASS", "^");
        System.out.println("Chrome browser id closed");
        System.out.println("DB connections are down");
    }
}
