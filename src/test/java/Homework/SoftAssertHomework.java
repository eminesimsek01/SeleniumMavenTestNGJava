package Homework;

import Utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHomework extends BaseTest {
    /*
    Test Case2: Negative Username Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username incorrectUser into Username field.
    Type password Password123 into Password field.
    Puch Submit button.
    Verify error message is displayed.
    Verify error message text is Your username is invalid!
     */

    @Override
    @AfterMethod
    public void tearDown() {
    }
    @Test
    public void negativeUsernameTest() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("lalala");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement errorMesssage=driver.findElement(By.xpath("//div[@id='error']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(errorMesssage.isDisplayed());
        softAssert.assertEquals(errorMesssage.getText(),"Your username is invalid!");
        softAssert.assertAll();
    }
}
