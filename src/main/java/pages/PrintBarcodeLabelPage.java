package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PrintBarcodeLabelPage extends BasePage {

    public PrintBarcodeLabelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[text()='Add Product']")
    private WebElement addProductLabel;

    @FindBy(xpath = "//label[@for='style']")
    private WebElement styleLabel;

    @FindBy(xpath = "//span[text()='Print:']")
    private WebElement printLabel;

    @FindBy(xpath = "//label[@for='site_name']")
    private WebElement siteName;

    @FindBy(xpath = "//label[@for='product_name']")
    private WebElement productName;

    @FindBy(xpath = "//label[@for='price']")
    private WebElement price;

    @FindBy(xpath = "//label[@for='currencies']")
    private WebElement currencies;

    @FindBy(xpath = "//label[@for='unit']")
    private WebElement unit;

    @FindBy(xpath = "//label[@for='category']")
    private WebElement category;

    @FindBy(xpath = "//label[@for='variants']")
    private WebElement variants;

    @FindBy(xpath = "//label[@for='product_image']")
    private WebElement productImage;

    @FindBy(xpath = "//label[@for='check_promo']")
    private WebElement checkPromotionalPrice;

    @FindBy(xpath = "//input[@id='add_item']")
    private WebElement addStyleInput;

    @FindBy(xpath = "//div[@id='s2id_style']")
    private WebElement styleCBO;

    @FindBy(xpath = "//li[@role='presentation']//div[@id='select2-result-label-8']")
    private WebElement styleItem;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][1]")
    private WebElement siteNameCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][2]")
    private WebElement productNameCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][3]")
    private WebElement priceCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][4]")
    private WebElement currenciesCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][5]")
    private WebElement unitCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][6]")
    private WebElement categoryCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][7]")
    private WebElement variantsCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][8]")
    private WebElement productImageCKB;

    @FindBy(xpath = "//div[@class='icheckbox_square-blue'][9]")
    private WebElement checkPromotionalPriceCKB;

    @FindBy(xpath = "//input[@name='print']")
    private WebElement updateButton;

    public boolean verifyPrintBarcodeLabel(){
        getWait().until(ExpectedConditions.visibilityOf(addProductLabel));
        getWait().until(ExpectedConditions.visibilityOf(styleLabel));
        getWait().until(ExpectedConditions.visibilityOf(printLabel));
        getWait().until(ExpectedConditions.visibilityOf(siteName));
        getWait().until(ExpectedConditions.visibilityOf(productName));
        getWait().until(ExpectedConditions.visibilityOf(price));
        getWait().until(ExpectedConditions.visibilityOf(currencies));
        getWait().until(ExpectedConditions.visibilityOf(unit));
        getWait().until(ExpectedConditions.visibilityOf(category));
        getWait().until(ExpectedConditions.visibilityOf(variants));
        getWait().until(ExpectedConditions.visibilityOf(productImage));
        getWait().until(ExpectedConditions.visibilityOf(checkPromotionalPrice));
        return addProductLabel.isDisplayed() &&
                styleLabel.isDisplayed() &&
                printLabel.isDisplayed() &&
                siteName.getText().equals("site name") &&
                productName.getText().equals("Product Name") &&
                price.getText().equals("Price") &&
                currencies.getText().equals("Currencies") &&
                unit.getText().equals("Unit") &&
                category.getText().equals("Category") &&
                variants.getText().equals("Variants") &&
                productImage.getText().equals("Product Image") &&
                checkPromotionalPrice.getText().equals("Check promotional price");
    }

    public void creatPrintBarcodeLabel(String productName){
        getWait().until(ExpectedConditions.visibilityOf(addStyleInput));
        addStyleInput.sendKeys(productName);
        getWait().until(ExpectedConditions.visibilityOf(styleCBO));
        styleCBO.click();
        getWait().until(ExpectedConditions.visibilityOf(styleItem));
        styleItem.click();
        getWait().until(ExpectedConditions.visibilityOf(siteNameCKB));
        siteNameCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(productNameCKB));
        productNameCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(priceCKB));
        priceCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(currenciesCKB));
        currenciesCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(unitCKB));
        unitCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(categoryCKB));
        categoryCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(variantsCKB));
        variantsCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(productImageCKB));
        productImageCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(checkPromotionalPriceCKB));
        checkPromotionalPriceCKB.isSelected();
        getWait().until(ExpectedConditions.visibilityOf(updateButton));
        updateButton.click();
    }

    @FindBy(xpath = "//img[@src='https://sma.tecdiary.net/assets/uploads/thumbs/15b75a2391585e635cfaafb829ec8b15.png']")
    private WebElement product_image;

    @FindBy(xpath = "//span[@class='barcode_site']")
    private WebElement barcode_site;

    @FindBy(xpath = "//span[@class='barcode_name']")
    private WebElement barcode_name;

    @FindBy(xpath = "//span[@class='barcode_price']")
    private WebElement barcode_price;

    @FindBy(xpath = "//span[@class='barcode_unit']")
    private WebElement barcode_unit;

    @FindBy(xpath = "//span[@class='barcode_category']")
    private WebElement barcode_category;

    @FindBy(xpath = "//span[@class='barcode_image']")
    private WebElement barcode_image;

    public boolean verifyPrintBarcodeLabelSuccess(){
        getWait().until(ExpectedConditions.visibilityOf(product_image));
        getWait().until(ExpectedConditions.visibilityOf(barcode_site));
        getWait().until(ExpectedConditions.visibilityOf(barcode_name));
        getWait().until(ExpectedConditions.visibilityOf(barcode_price));
        getWait().until(ExpectedConditions.visibilityOf(barcode_unit));
        getWait().until(ExpectedConditions.visibilityOf(barcode_category));
        getWait().until(ExpectedConditions.visibilityOf(barcode_image));
        return product_image.isDisplayed() &&
                barcode_site.getText().equals("Stock Manager Advance") &&
                barcode_name.getText().equals("Kiwi") &&
                barcode_price.getText().equals("Price USD: 3.90, ERU: 2.86") &&
                barcode_unit.getText().equals("Unit: 4") &&
                barcode_category.getText().equals("Category: Fruits") &&
                barcode_image.isDisplayed();
    }
}
