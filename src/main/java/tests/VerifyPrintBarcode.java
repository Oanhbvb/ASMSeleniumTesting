package tests;

import core.BasePage;
import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.ListProductPage;
import pages.LoginPage;
import pages.PrintBarcodeLabelPage;

public class VerifyPrintBarcode extends BaseTest {

    @Test
    public void TC6VerifyPrintBarcode(){
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        PrintBarcodeLabelPage printBarcodeLabelPage = new PrintBarcodeLabelPage(getDriver());

        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
        loginPage.login("admin@tecdiary.com","12345678");
        getDriver().manage().window().maximize();
        Assert.assertTrue(dashboardPage.verifyDashboard());
        dashboardPage.showPrintBarcodeLabel();
        Assert.assertTrue(printBarcodeLabelPage.verifyPrintBarcodeLabel());
    }

    @Test
    public void TC7VerifyPrintBarcodeSuccess(){
        LoginPage loginPage = new LoginPage(getDriver());
        DashboardPage dashboardPage = new DashboardPage(getDriver());
        PrintBarcodeLabelPage printBarcodeLabelPage = new PrintBarcodeLabelPage(getDriver());

        loginPage.navigateToLogin("https://sma.tecdiary.net/admin");
        Assert.assertTrue(loginPage.verifyLoginPage());
        loginPage.login("admin@tecdiary.com","12345678");
        getDriver().manage().window().maximize();
        Assert.assertTrue(dashboardPage.verifyDashboard());
        dashboardPage.showPrintBarcodeLabel();
        Assert.assertTrue(printBarcodeLabelPage.verifyPrintBarcodeLabel());
        printBarcodeLabelPage.creatPrintBarcodeLabel("Kiwi");
        Assert.assertTrue(printBarcodeLabelPage.verifyPrintBarcodeLabelSuccess());
    }
}
