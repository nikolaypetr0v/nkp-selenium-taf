package annotationsDemo;

import org.testng.annotations.*;
import utils.TestFormating;

public class LoginTests extends TestFormating {

    @Test(groups = "smoke", priority = 0)
    public void validateUserCanLoginWithValidCredentials(){
        provideFormatForTest("TEST", "*");
        System.out.println("The user can login with valid credentials.");
    }

    @Test(groups = "smoke", priority = 0)
    public void validateUserCannotLoginWithoutPassword(){
        provideFormatForTest("TEST", "*");
        System.out.println("The user cannot login without password.");
    }

    @Test(groups = "smoke", priority = 0)
    public void validateUserCannotLoginWithoutUsername(){
        provideFormatForTest("TEST", "*");
        System.out.println("The user cannot login without username.");
    }

    @Test(groups = "smoke", priority = 0)
    public void validateUserCannotLoginWithUsernameLength8Symbols(){
        provideFormatForTest("TEST", "*");
        System.out.println("The user cannot login with 8 symbols username.");
    }

    @Test(groups = "regression")
    public void validateUserCannotLoginWithUsernameLength44Symbols(){
        provideFormatForTest("TEST", "*");
        System.out.println("The user cannot login with 44 symbols username.");
    }

    @Test(dependsOnMethods = "validateUserCanLoginWithValidCredentials")
    public void buyASingleProduct(){
        provideFormatForTest("TEST", "*");
        System.out.println("The user will buy a product.");
    }
}
