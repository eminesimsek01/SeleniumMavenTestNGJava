package Homework;

import Utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HardSoftAssertHomework01 extends BaseTest {
    /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Puch Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
     */

    @AfterMethod
    @Override
    public void tearDown() {

    }

    @Test
    public void positiveLoginTest() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("student");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        WebElement feedbackBox=driver.findElement(By.xpath("//div[@id='loop-container']//p"));
        Assert.assertTrue(feedbackBox.getText().contains("Congratulations"),"Congratualions is not written");
        Assert.assertTrue(feedbackBox.getText().contains("successfully logged in"),"Unsuccessful login");

        WebElement logOutButton=driver.findElement(By.xpath("//div[@class='is-layout-flow wp-block-group']//a"));
        Assert.assertTrue(logOutButton.isDisplayed(),"Unfortunately, logout Button is not displayed");

    }
}
