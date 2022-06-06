package tests;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
    @Test(groups = "smoke")
    public void TestA() {
        System.out.println("testA");
      
    }
    //this one disabled by enable=false
    @Test(enabled = false)
    public void TestB() {
        System.out.println("testB"); 
      
    }
    //this one moved to the end by depends on another method
    //+ timeout waiting
    @Test(dependsOnMethods = "TestA",timeOut = 4000)
    public void TestC() {
        System.out.println("testC");
      
    }
    @Parameters({"URL","path"})
    @Test
    public void TestD(String urlname2,String pathname) {
        System.out.println("testD");
        System.out.println(urlname2+pathname);
      
    }
    //Execute BEFORE ALL test
    @BeforeSuite
    private void inTheBegining() {
        System.out.println("_-=inTheBegining=-_");
    }
    //Execute at the end of everyting
    @AfterSuite()
    private void endOfEverything() {
        System.out.println("darkness.....");
        
    }
}