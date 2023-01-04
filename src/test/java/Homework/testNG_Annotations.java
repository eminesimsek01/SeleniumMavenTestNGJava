package Homework;

import org.testng.annotations.*;

public class testNG_Annotations {
     /*
    Create a class.
    Create 2 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.
     */

    @Test
    public void thefirstTest() {
        System.out.println("Birinci test çalışıyor");
    }
    @Test
    public void thesecondTest() {
        System.out.println("İkinci test çalışıyor");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("BeforeSuite çalışıyor");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("AfterSuite çalışıyor");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class çalışıyor");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class çalışıyor");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod çalışıyor");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod çalışıyor");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest çalışıyor");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest çalışıyor");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups çalışıyor");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("AfterGroups çalışıyor");
    }
    /*
    BeforeSuite çalışıyor: Bütün methodlardan önce çalıştı
    BeforeTest:The @BeforeTest annotated method will be executed before the execution of all the test methods
    of available classes belonging to that folder.
    Before Class çalışıyor:	The @BeforeClass annotated method will be executed before the first method
    of the current class is invoked.
    BeforeMethod çalışıyor:The @BeforeMethod annotated method will be executed before each test method will run.
    Birinci test çalışıyor
    AfterMethod çalışıyor: The @AfterMethod annotated method will run after the execution of each test method.
    BeforeMethod çalışıyor:The @BeforeMethod annotated method will be executed before each test method will run.
    İkinci test çalışıyor
    AfterMethod çalışıyor: The @AfterMethod annotated method will run after the execution of each test method.
    After Class çalışıyor: The @AfterClass annotated method will be invoked after the execution of all the
    test methods of the current class.
    AfterTest:The @AfterTest annotated method will be executed after the execution of all the test methods of
    available classes belonging to that folder.
    AfterSuite çalışıyor: The @AfterSuite annotated method will run after the execution of all the test
    methods in the suite.
    Hiyerarşi: Suite-Test-Class-Method
     */

}
