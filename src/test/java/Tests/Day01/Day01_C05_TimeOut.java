package Tests.Day01;

import org.testng.annotations.Test;

public class Day01_C05_TimeOut {
    //timeOut set edildiğinde test süresi bu süreyi geçmemelidir. Geçmesi durumunda test exception fırlatır.
    //timeOut gerçekleştiği andan itibaren sonraki satırlar execute edilmez(çalıştırılmaz).
    //Exception sonrası kod bloklarımız execute edilmez kod yarıda kesilir.
    @Test(timeOut = 1000)
    public void passedTest(){
        System.out.println("1 saniyeden önce çalıştı");
    }
    @Test
    public void timedOutTest() throws InterruptedException{
        Thread.sleep(1100);
        System.out.println("1 saniyeden sonra çalıştı");

    }
}
