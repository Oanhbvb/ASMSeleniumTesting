package tests;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class VerifyLoginPage extends BaseTest {

    @Test
    public void TC01VerifyLoginPage(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Test
    public void TC02VerifyLogin(){
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
        getDriver().manage().window().maximize();
        loginPage.login("admin@tecdiary.com","12345678");
        Assert.assertTrue(dashboardPage.verifyDashboard());
    }
}
