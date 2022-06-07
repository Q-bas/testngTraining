package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        
        return super.equals(obj);
    }

    // @Override
    // protected void finalize() throws Throwable {
        
    //     super.finalize();
    // }

    @Override
    public int hashCode() {
        
        return super.hashCode();
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

    @Override
    public void onFinish(ITestContext context) {
        
        ITestListener.super.onFinish(context);
    }

    @Override
    public void onStart(ITestContext context) {
        
        ITestListener.super.onStart(context);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        
        System.out.println("Failed "+result.getName());
        
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestStart(ITestResult result) {
        
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        
        System.out.println("test success");;
    }
    
}
