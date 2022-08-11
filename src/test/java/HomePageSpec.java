import Pages.HomePage;
import Pages.LogInPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import drivers.DriverSingleton;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class HomePageSpec {
    static WebDriver driver;
    static HomePage homePage ;
    static LogInPage logInPage;
    static ExtentTest test;
    static ExtentReports report = new ExtentReports("Reports/TestReport.html");

    @BeforeClass
    public static void initializeObjects(){
        DriverSingleton.getInstance("EdgeDriver");
        driver = DriverSingleton.getDriver();
        homePage = new HomePage();
        logInPage = new LogInPage();
        test = report.startTest("Home Page Tests");
    }

    @Test
    public void testingAuthentication(){
        driver.get("http://localhost:8080/login/auth");
        logInPage.login("super","pass");
        test.log(LogStatus.PASS,"User authenticated successfully");
    }

    @Test
    public  void testingNavigationBar(){
        driver.get("http://localhost:8080/deposit/index");

        homePage.clickMakeDepositLink();
        assertEquals("Member Deposit Form",homePage.getMakeDepositTitle());

        homePage.clickViewDepositsLink();
        assertEquals("Manage Deposits",homePage.getManageDepositsTitle());

        homePage.clickmemberInfoLink();
        assertEquals("Documents",homePage.getdocumentsTitle());

        homePage.clickproductsLink();
        assertEquals("Deposit Group",homePage.getdepositGroupTitle());

        homePage.clickauditLogLink();
        assertEquals("Audit Logs",homePage.getauditLogTitle());

        homePage.clickupdateProfileLink();
        assertEquals("User",homePage.getuserTitle());
        test.log(LogStatus.PASS,"Navigation bar if fully operational");

    }
    @AfterClass
     public static void closeObjects(){
        report.endTest(test);
        report.flush();
        driver.close();
    }
}
