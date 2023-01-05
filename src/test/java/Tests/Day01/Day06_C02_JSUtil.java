package Tests.Day01;


import Utilities.BaseCrossBrowserTest;
import Utilities.jsUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Day06_C02_JSUtil extends BaseCrossBrowserTest {
         /*
         Go to URL: https://www.amazon.com/
         Scroll in to view Amazon Ignite WebElement.
         Scroll up search area WebElement.
         Then flashing the background color.
          */
        @Test
        public void test() throws InterruptedException {
            jsUtils.driver = driver;

            driver.get("https://www.amazon.com/");
            jsUtils.scrollIntoViewJS( driver.findElement(By.partialLinkText("Amazon Ignite")));

            // Debug amacli
            Thread.sleep(4000);

            jsUtils.scrollAllUpByJS();

            Thread.sleep(4000);

            jsUtils.flash( driver.findElement(By.id("twotabsearchtextbox")));

            Thread.sleep(4000);

        }
    }

