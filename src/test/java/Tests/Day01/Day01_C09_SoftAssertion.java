package Tests.Day01;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_SoftAssertion {
    @Test
    public void hardAssertion() {
        System.out.println("Assertion öncesi çalışıyor");
        Assert.assertEquals(1,2);
        System.out.println("Assertion sonrası çalışıyor");
    }

    @Test
    public void softAssertion() {
        System.out.println("Soft Assertion öncesi çalışıyor");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(1,2);//fail
        softAssert.assertTrue(true);//pass
        System.out.println("Soft Assertion sonrası çalışıyor");
        softAssert.assertAll();//Method sonunda kesinlikle çağırılmalı


    }
}
