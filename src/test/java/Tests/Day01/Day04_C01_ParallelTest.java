package Tests.Day01;

import Utilities.BaseTest;
import org.testng.annotations.Test;

public class Day04_C01_ParallelTest extends BaseTest {
    @Test
    public void test01() {
        driver.get("https://www.google.com/");
    }

    @Test
    public void test02() {
        driver.get("https://www.google.com/");
    }

    @Test
    public void test03() {
        driver.get("https://www.trendyol.com/");
    }
}
