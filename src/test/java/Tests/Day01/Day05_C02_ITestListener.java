package Tests.Day01;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Day05_C02_ITestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStrat methodu çalıştı");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess methodu çalıştı");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("onTestFailure methodu çalıştı");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println("onTestSkipped methodu çalıştı");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        System.out.println("onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

        System.out.println("onTestFailedWithTimeout");
    }

    @Override
    public void onStart(ITestContext context) {

        System.out.println("onStart test çalıştı");
    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("onFinish test çalıştı");
    }
}
