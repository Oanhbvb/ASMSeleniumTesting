package pages;

import core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[text()='You are successfully logged in.']")
    private WebElement messageLoginSusscess;

    @FindBy(xpath = "//h2[text()='Overview Chart']")
    private WebElement overViewChart;

    @FindBy(xpath = "//h2[text()='Quick Links']")
    private WebElement quickLink;

    @FindBy(xpath = "//h2[text()=' Latest Five']")
    private WebElement latestFive;

    @FindBy(xpath = "//h2[text()='Best Sellers (Mar-2024) ']")
    private WebElement bestSellers;

    @FindBy(xpath = "//li[@class='mm_products']")
    private WebElement productsMenu;

    @FindBy(xpath = "//li[@id='products_index']")
    private WebElement listProducts;

    @FindBy(xpath = "//li[@id='products_print_barcodes']")
    private WebElement printBarcodeLabel;

    @FindBy(xpath = "//li[@class='mm_sales ']")
    private WebElement sales;

    @FindBy(xpath = "//li[@id='sales_add']")
    private WebElement addSale;

    @FindBy(xpath = "//input[@id='add_sale']")
    private WebElement addSaleSubmitButton;

    @FindBy(xpath = "//li[@class='mm_purchases']")
    private WebElement purchases;

    @FindBy(xpath = "//li[@id='purchases_index']")
    private WebElement purchasesList;

    @FindBy(xpath = "//li[@id='purchases_add']")
    private WebElement addPurchasesList;
    public boolean verifyDashboard(){
        getWait().until(ExpectedConditions.visibilityOf(messageLoginSusscess));
        getWait().until(ExpectedConditions.visibilityOf(overViewChart));
        getWait().until(ExpectedConditions.visibilityOf(quickLink));
        getWait().until(ExpectedConditions.visibilityOf(latestFive));
        getWait().until(ExpectedConditions.visibilityOf(bestSellers));
        return messageLoginSusscess.isDisplayed() &&
                overViewChart.isDisplayed() &&
                quickLink.isDisplayed() &&
                latestFive.isDisplayed() &&
                bestSellers.isDisplayed();
    }

    public void showListProduct(){
        getWait().until(ExpectedConditions.visibilityOf(productsMenu));
        productsMenu.click();
        getWait().until(ExpectedConditions.visibilityOf(listProducts));
        listProducts.click();
    }

    public void showPrintBarcodeLabel(){
        getWait().until(ExpectedConditions.visibilityOf(productsMenu));
        productsMenu.click();
        getWait().until(ExpectedConditions.visibilityOf(printBarcodeLabel));
        printBarcodeLabel.click();
    }

    public void showSales(){
        getWait().until(ExpectedConditions.visibilityOf(productsMenu));
        productsMenu.click();
        getWait().until(ExpectedConditions.visibilityOf(sales));
        sales.click();
        getWait().until(ExpectedConditions.visibilityOf(addSale));
        addSale.click();
        getWait().until(ExpectedConditions.visibilityOf(addSaleSubmitButton));
        addSaleSubmitButton.isDisplayed();
    }

    public void showPurchasesList(){
        getWait().until(ExpectedConditions.visibilityOf(productsMenu));
        productsMenu.click();
        getWait().until(ExpectedConditions.visibilityOf(purchases));
        purchases.click();
        getWait().until(ExpectedConditions.visibilityOf(purchasesList));
        purchasesList.click();
    }

    public void showAddPurchasesList(){
        getWait().until(ExpectedConditions.visibilityOf(productsMenu));
        productsMenu.click();
        getWait().until(ExpectedConditions.visibilityOf(purchases));
        purchases.click();
        getWait().until(ExpectedConditions.visibilityOf(addPurchasesList));
        addPurchasesList.click();
    }


}
