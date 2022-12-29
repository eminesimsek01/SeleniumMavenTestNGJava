package Tests.Day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_C03_DependsOn {
    //Home page testimiz login testimize bağlı olduğundan dependsOn attribute unu kullanabiliriz.
    //Bağımlı olunan test fail olursa bağımlı olan method ignore edilir.
    //Bağımlı olan method alfabetik executiona bakılmaksızın bağımlı olunan methoddan sonra çalışır.
    // Coklu dependsOn kullaniminda tum bagimli olunan methodlar pass oldugu durumda bagimli method calisir
    @Test
    public void loginTest(){
        System.out.println("Login testi yapılıyor");
    }
    @Test
    public void registrationTest(){
        System.out.println("Kayıt testi yapılıyor");
        Assert.fail();
    }

    @Test(dependsOnMethods={"loginTest","registrationTest"})
    public void homePageTest() {
        System.out.println("HomeP age testi yapılıyor");
    }
}
