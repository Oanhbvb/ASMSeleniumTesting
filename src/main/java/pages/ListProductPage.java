package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ListProductPage extends BasePage {

    public ListProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//th[@class='sorting_disabled' and text()='Image']")
    private WebElement imageColumn;

    @FindBy(xpath = "//th[text()='Code']")
    private WebElement codeColumn;

    @FindBy(xpath = "//th[text()='Name']")
    private WebElement nameColumn;

    @FindBy(xpath = "//th[text()='Brand']")
    private WebElement brandColumn;

    @FindBy(xpath = "//th[text()='Category']")
    private WebElement categoryColumn;

    @FindBy(xpath = "//th[text()='Cost']")
    private WebElement costColumn;

    @FindBy(xpath = "//th[text()='Price']")
    private WebElement priceColumn;

    @FindBy(xpath = "//th[text()='Quantity']")
    private WebElement quantityColumn;

    @FindBy(xpath = "//th[text()='Unit']")
    private WebElement unitColumn;

    @FindBy(xpath = "//th[text()='Alert Quantity']")
    private WebElement alertQuantity;

    @FindBy(xpath = "//th[text()='Actions']")
    private WebElement actions;

    @FindBy(xpath = "//tr[@class='product_link']//td[text()='Lemon']")
    private WebElement lemonProduct;

    @FindBy(xpath = "//div[@id='s2id_autogen1']")
    private WebElement showPage;

    @FindBy(xpath = "//div[@id='select2-result-label-4']")
    private WebElement selectPage;

    @FindBy(xpath = "//tr[@class='product_link'][17]")
    private WebElement mouseProduct;

    @FindBy(xpath = "//tr[@class='product_link'][17]//button[text()='Actions ']")
    private WebElement actionButton;

    @FindBy(xpath = "//tr[@class='product_link'][17]//ul[@class='dropdown-menu pull-right']//a[@href='https://sma.tecdiary.net/admin/products/edit/13']")
    private WebElement editItem;

    @FindBy(xpath = "//form[@class='bv-form']//div[@class='form-group']//label[@for='type']")
    private WebElement productTypeLabel;

    @FindBy(xpath = "//div[@id='s2id_type']")
    private WebElement productTypeCBO;

    @FindBy(xpath = "//li[@role='presentation']//div[text()='Combo']")
    private WebElement productTypeItem;

    @FindBy(xpath = "//form[@class='bv-form']//div[@class='form-group all']//label[@for='name']")
    private WebElement productNameLabel;

    @FindBy(xpath = "//form[@class='bv-form']//div[@class='form-group all']//label[@for='code']")
    private WebElement productCodeLabel;

    @FindBy(xpath = "//form[@class='bv-form']//div[@class='form-group all']//label[@for='slug']")
    private WebElement slug;

    @FindBy(xpath = "//form[@class='bv-form']//div[@class='form-group all']//label[@for='barcode_symbology']")
    private WebElement barCode;

    @FindBy(xpath = "//div[@id='s2id_barcode_symbology']")
    private WebElement barCodeCBO;

    @FindBy(xpath = "//li[@role='presentation']//div[text()='EAN8']")
    private WebElement barCodeItem;

    @FindBy(xpath = "//div[@id='s2id_tax_method']")
    private WebElement taxMethodCBO;

    @FindBy(xpath = "//li[@role='presentation']//div[text()='Exclusive']")
    private WebElement taxMethodItem;

    @FindBy(xpath = "//input[@name='edit_product']")
    private WebElement editSubmit;

    public boolean verifyListProduct(){
        getWait().until(ExpectedConditions.visibilityOf(imageColumn));
        getWait().until(ExpectedConditions.visibilityOf(codeColumn));
        getWait().until(ExpectedConditions.visibilityOf(nameColumn));
        getWait().until(ExpectedConditions.visibilityOf(brandColumn));
        getWait().until(ExpectedConditions.visibilityOf(categoryColumn));
        getWait().until(ExpectedConditions.visibilityOf(costColumn));
        getWait().until(ExpectedConditions.visibilityOf(priceColumn));
        getWait().until(ExpectedConditions.visibilityOf(quantityColumn));
        getWait().until(ExpectedConditions.visibilityOf(unitColumn));
        getWait().until(ExpectedConditions.visibilityOf(alertQuantity));
        getWait().until(ExpectedConditions.visibilityOf(actions));

        return imageColumn.isDisplayed() &&
                codeColumn.isDisplayed() &&
                nameColumn.isDisplayed() &&
                brandColumn.isDisplayed() &&
                categoryColumn.isDisplayed() &&
                costColumn.isDisplayed() &&
                priceColumn.isDisplayed() &&
                quantityColumn.isDisplayed() &&
                unitColumn.isDisplayed() &&
                alertQuantity.isDisplayed() &&
                actions.isDisplayed();
    }

    public void findLemonProduct(){
        getWait().until(ExpectedConditions.visibilityOf(lemonProduct));
        lemonProduct.click();
    }

    public void editProductDisplay(){
        getWait().until(ExpectedConditions.visibilityOf(showPage));
        showPage.click();
        getWait().until(ExpectedConditions.visibilityOf(selectPage));
        selectPage.click();
        getWait().until(ExpectedConditions.visibilityOf(actionButton));
        actionButton.click();
        getWait().until(ExpectedConditions.visibilityOf(editItem));
        editItem.click();
    }

    public boolean verifyEditProductPage(){
        getWait().until(ExpectedConditions.visibilityOf(productTypeLabel));
        getWait().until(ExpectedConditions.visibilityOf(productNameLabel));
        getWait().until(ExpectedConditions.visibilityOf(productCodeLabel));
        getWait().until(ExpectedConditions.visibilityOf(slug));
        getWait().until(ExpectedConditions.visibilityOf(barCode));
        return productTypeLabel.isDisplayed() &&
                productNameLabel.isDisplayed() &&
                productCodeLabel.isDisplayed() &&
                slug.isDisplayed() &&
                barCode.isDisplayed();
    }

    public void editProductDetail(){
        getWait().until(ExpectedConditions.visibilityOf(productTypeCBO));
        productTypeCBO.click();
        getWait().until(ExpectedConditions.visibilityOf(productTypeItem));
        productTypeItem.click();
        getWait().until(ExpectedConditions.visibilityOf(barCodeCBO));
        barCodeCBO.click();
        getWait().until(ExpectedConditions.visibilityOf(barCodeItem));
        barCodeItem.click();
        getWait().until(ExpectedConditions.visibilityOf(taxMethodCBO));
        taxMethodCBO.click();
        getWait().until(ExpectedConditions.visibilityOf(taxMethodItem));
        taxMethodItem.click();
        getWait().until(ExpectedConditions.visibilityOf(editSubmit));
        editSubmit.click();
    }


}
