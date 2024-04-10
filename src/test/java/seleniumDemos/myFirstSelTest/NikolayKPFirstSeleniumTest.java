package seleniumDemos.myFirstSelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NikolayKPFirstSeleniumTest {
    public static final String BASE_URL = "http://training.skillo-bg.com:4300/";
    public static final String HOME_PAGE = BASE_URL + "posts/all";

    @Test
    public void testOpeningISkilloSiteSignInPage() throws InterruptedException {
        int WAIT = 5000;

        WebDriver driver = new ChromeDriver();
        driver.get(HOME_PAGE);
        Thread.sleep(WAIT);

        // Step 1: Navigate to the Sign-in page
        WebElement loginBtn = driver.findElement(By.cssSelector("#nav-link-login"));
        loginBtn.click();

        //How to quit browser
        driver.quit();
    }
}
