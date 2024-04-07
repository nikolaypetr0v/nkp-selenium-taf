package annotationsDemo;

import basicTestDemo.BasicTestDemonstrationClass;
import org.testng.annotations.Test;

public class BasicAnnotationDemos extends BasicTestDemonstrationClass {
    @Test
    public void basicTestAnnotation(){
        System.out.println("My first test case with TestNG is living here.");
    }
}
