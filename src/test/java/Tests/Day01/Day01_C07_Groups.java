package Tests.Day01;

import org.testng.annotations.Test;

public class Day01_C07_Groups {
    //Bu groups attribute'u sayesinde biz istediğimiz gruplara sahip test caselerini özel olarak çalıştırabilriz.

    @Test(groups={"smoke","regression"})
    public void loginTest() {

    }

    @Test(groups={"regression"})
    public void aboutTest() {

    }

    @Test(groups={"regression"})
    public void contactTest() {

    }

    @Test(groups={"regression","smoke"})
    public void registrationTest() {

    }

    @Test(groups={"regression","smoke"})
    public void checkoutTest(){

    }
}
