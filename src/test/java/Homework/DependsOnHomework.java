package Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DependsOnHomework {
    /*
    Create tests that depend on each other
    Create beforeClass and set up settings.
    By creating interdependent tests;
    First go to Facebook.
    Then go to Google depending on Facebook,
    Then go to Amazon depending on Google
    Close the driver.
     */
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testFacebook() {
        driver.get("https://tr-tr.facebook.com/");
    }
    @Test(dependsOnMethods = {"testFacebook"})
    public void testGoogle() {
        driver.get("https://www.google.com.tr/");
    }
    @Test(dependsOnMethods = {"testGoogle"})
    public void testAmazon() {
        driver.get("https://www.amazon.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
