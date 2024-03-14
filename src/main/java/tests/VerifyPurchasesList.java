package tests;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PurchasesListPage;

public class VerifyPurchasesList extends BaseTest {

    @Test
    public void TC9VerifyPurchasesList(){
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        PurchasesListPage purchasesListPage = new PurchasesListPage(getDriver());

        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
        loginPage.login("admin@tecdiary.com","12345678");
        Assert.assertTrue(dashboardPage.verifyDashboard());
        dashboardPage.showPurchasesList();
        Assert.assertTrue(purchasesListPage.verifyListPurchases());
    }
}
