package dataProviders;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderFromXMLDemo {
    @Parameters({"fullName"})
    @Test()
    public void provideSingleParamDemo(@Optional("Guest") String name){
        System.out.println("WELCOME " + name );
    }

    @Parameters({"firstName","lastName","age"})
    @Test()
    public void testMultiParameters(String fName, String lName, String age){
        System.out.println("Greetings from " + fName + " " + lName + " " + ". And I am " + age + " year(s) old." );
    }
}
