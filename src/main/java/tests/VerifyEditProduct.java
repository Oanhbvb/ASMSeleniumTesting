package tests;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class VerifyEditProduct extends BaseTest {

    @Test
    public void TC5VerifyEditProduct(){
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        ListProductPage listProductPage = new ListProductPage(getDriver());
        EditProductPage editProductPage = new EditProductPage(getDriver());

        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
        loginPage.login("admin@tecdiary.com","12345678");
        Assert.assertTrue(dashboardPage.verifyDashboard());
        dashboardPage.showListProduct();
        Assert.assertTrue(listProductPage.verifyListProduct());
        listProductPage.editProductDisplay();
        Assert.assertTrue(listProductPage.verifyEditProductPage());
        listProductPage.editProductDetail();
    }

}
