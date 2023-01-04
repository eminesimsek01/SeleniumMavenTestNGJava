package Tests.Day01;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Day05_C02_ITestListener.class)
public class Day05_C03_UseListener {
    @Test
    public void passedTest() {
        System.out.println("Test passed");
    }

    @Test
    public void failedTest() {
        System.out.println("Test failed");
        Assert.fail();
    }
    @Test (timeOut = 500)
    public void timeOutTest() throws InterruptedException {
        System.out.println("Timed out tesst");
        Thread.sleep(600);
    }
}
