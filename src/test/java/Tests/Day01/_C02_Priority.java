package Tests.Day01;

import org.testng.annotations.Test;

    //TestNG(default) olarak @Test annotationları alfabetik olarak sıraya göre execute eder.
    //TestNG prioritisinin sayı değeri en az olan testi ilk önce çalıştırır.
    //Priority attributu için negatif değerler kullanılabilir
    //TestNG default(varsayılan) priority=0'dır.

public class _C02_Priority {
    @Test(priority=1000)
    public void test02(){


    }
    @Test(priority=1500)
    public void test04(){

    }
    @Test
    public void test01(){

    }
    @Test(priority=2000)
    public void test03(){

    }
}
