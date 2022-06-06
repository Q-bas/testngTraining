package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
    @Parameters({"URL"})
    @Test
    public void Test1_1(String urlname) {
        System.out.println("test1");
        System.out.println(urlname);
    }
    @Test(groups = "smoke")
    public void Test2_1() {
        System.out.println("test2");
      
    }
    @Test
    public void Test3_1() {
        System.out.println("test3");
      
    }
    @Test(groups = "smoke")
    public void Test4_1() {
        System.out.println("test4");
      
    }
    //Execute Before EACH method
    @BeforeMethod
    private void betweenMethods() {
        System.out.println("___________________________________");       
    }
    @AfterMethod
    private void sameAfter() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}