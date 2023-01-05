package Homework;

import Utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SofAssertHomework02 extends BaseTest {
    /*
    Test Case3: Negative Password Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field.
    Type password incorrectPassword into Password field.
    Puch Submit button.
    Verify error message is displayed.
    Verify error message text is Your password is invalid!
     */
    @Test
    public void negativeUsernameTest() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("student");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("password");
        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement errorMesssage=driver.findElement(By.xpath("//div[@id='error']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(errorMesssage.isDisplayed());
        softAssert.assertEquals(errorMesssage.getText(),"Your password is invalid!");
        softAssert.assertAll();
    }


}
