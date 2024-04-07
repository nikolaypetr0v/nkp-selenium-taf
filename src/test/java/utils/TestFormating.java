package utils;

import org.testng.annotations.*;

public class TestFormating {

    public void provideFormatForTest(String anno, String separator){
        System.out.println();
        for (int i = 0; i < 40; i++) {
            System.out.print(separator);
        }
        System.out.println();

        System.out.println("THIS IS ANNOTATION: " + anno.toUpperCase());

        System.out.println();
        for (int i = 0; i < 40; i++) {
            System.out.print(separator);
        }
        System.out.println();
    }
}
