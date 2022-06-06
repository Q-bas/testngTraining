package tests;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day1 {
    @Test(dataProvider = "getData")
    public void Test_first(String usrname, String pwd) {
        System.out.println("Hello world");
        System.out.println(usrname + "+" + pwd);
       // Assert.assertTrue(0==0);

    }
    //execute BREFORE all tests
    @BeforeTest
    private void prerequisite() {
        System.out.println("E X E C U T E day1");
        System.out.println("----------------------------------------------");
    }
    // execute at the very end of all tests in this folder <test>
    @AfterTest
    private void endOfTests() {
        System.out.println("This is the end.......");

    }
    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "user1";
        data[0][1] = "pass1";
        data[1][0] = "user2";
        data[1][1] = "pass2";
        data[2][0]= "user3";
        data[2][1]="pass3";
        return data;


    }
}
