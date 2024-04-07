package annotationsDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AfterClassAnoDemo extends BasicAnnotationDemos{
    @AfterClass
    public void closeBrowserAndSessionForTheLoginTestCases(){
        provideFormatForTest("AFTER class", "#");
    }

    @Test
    public void verifyUserCanLogWithValidCredentials(){
        provideFormatForTest("TEST LOGIN with Password and USerName", "________");
    }

    @Test
    public void verifyUserCanNOTLogWithInvalidCredentialsMissingPass(){
        provideFormatForTest("TEST LOGIN only with USerName", "---------");
    }


    @Test
    public void verifyUserCanNOTLogWithInvalidCredentialsMissingUserName(){
        provideFormatForTest("TEST LOGIN only with pass", "---------");
    }
}
