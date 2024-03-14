package tests;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.ListProductPage;
import pages.LoginPage;

public class VerifyListProducts extends BaseTest {

    @Test
    public void TC3VerifyListProduct(){
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        ListProductPage lstProduct = new ListProductPage(getDriver());

        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
        loginPage.login("admin@tecdiary.com","12345678");
        getDriver().manage().window().maximize();
        Assert.assertTrue(dashboardPage.verifyDashboard());
        dashboardPage.showListProduct();
        Assert.assertTrue(lstProduct.verifyListProduct());

    }

}
