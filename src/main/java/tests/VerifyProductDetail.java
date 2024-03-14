package tests;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.ListProductPage;
import pages.LoginPage;
import pages.ProductDetailPage;

public class VerifyProductDetail extends BaseTest {

    @Test
    public void TC4VerifyProductDetail(){
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        ListProductPage listProductPage = new ListProductPage(getDriver());
        ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());

        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
        loginPage.login("admin@tecdiary.com","12345678");
        Assert.assertTrue(dashboardPage.verifyDashboard());
        dashboardPage.showListProduct();
        Assert.assertTrue(listProductPage.verifyListProduct());
        listProductPage.findLemonProduct();
        Assert.assertTrue(productDetailPage.verifyProductDetail());
    }
}
