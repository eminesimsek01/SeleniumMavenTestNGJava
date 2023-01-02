package Tests.Day01;

import Utilities.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowserTesting extends BaseCrossBrowserTest {

    //browser bilgisi testng.xml dosyasından alınacağından dolayı kod sonrasında herhangi bir değişiklik
    //görüntülenemeyecektir.
    @Test
    public void testCrossBrowser() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Google");
    }
}
