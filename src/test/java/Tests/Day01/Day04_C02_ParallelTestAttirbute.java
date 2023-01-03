package Tests.Day01;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttirbute {
    @Test(threadPoolSize=3, //testimizin kaç çekiredekte paralel olarak çalışacağını belirler
    invocationCount=8       //testimizin kaç defa çalıştırılacağını belirler
    )
    public void test(){
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
    }
    /*
    Thread.currentThread().getId() = 20
    Thread.currentThread().getId() = 22
    Thread.currentThread().getId() = 21
    Thread.currentThread().getId() = 21
    Thread.currentThread().getId() = 20
    Thread.currentThread().getId() = 22
    Thread.currentThread().getId() = 21
    Thread.currentThread().getId() = 22

    ===============================================
    Default Suite
    Total tests run: 8, Passes: 8, Failures: 0, Skips: 0
    ===============================================
     */
}
