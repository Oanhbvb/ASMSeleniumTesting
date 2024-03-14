package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//img[@id='pr-image']")
    private WebElement productImage;

    @FindBy(xpath = "//td[text()='Barcode & QRcode']")
    private WebElement barcodeQrcode;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[3]//td[1]")
    private WebElement type;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[3]//td[2]")
    private WebElement typeValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[4]//td[1]")
    private WebElement name;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[4]//td[2]")
    private WebElement nameValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[5]//td[1]")
    private WebElement code;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[5]//td[2]")
    private WebElement codeValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[7]//td[1]")
    private WebElement category;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[7]//td[2]")
    private WebElement categoryValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[8]//td[1]")
    private WebElement unit;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[8]//td[2]")
    private WebElement unitValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[9]//td[1]")
    private WebElement cost;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[9]//td[2]")
    private WebElement costValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[10]//td[1]")
    private WebElement price;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[10]//td[2]")
    private WebElement priceValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[11]//td[1]")
    private WebElement taxRate;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[11]//td[2]")
    private WebElement taxRateValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[12]//td[1]")
    private WebElement taxMethod;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[12]//td[2]")
    private WebElement taxMethodValue;

    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[13]//td[1]")
    private WebElement alertQuantity;
    @FindBy(xpath = "//table[@class='table table-borderless table-striped dfTable table-right-left']//tr[13]//td[2]")
    private WebElement alertQuantityValue;

    @FindBy(xpath = "//div[@class='panel panel-primary']//div[text()='Product Details']")
    private WebElement productDetail;

    public boolean verifyProductDetail(){
        getWait().until(ExpectedConditions.visibilityOf(productImage));
        getWait().until(ExpectedConditions.visibilityOf(barcodeQrcode));
        getWait().until(ExpectedConditions.visibilityOf(type));
        getWait().until(ExpectedConditions.visibilityOf(typeValue));
        getWait().until(ExpectedConditions.visibilityOf(name));
        getWait().until(ExpectedConditions.visibilityOf(nameValue));
        getWait().until(ExpectedConditions.visibilityOf(code));
        getWait().until(ExpectedConditions.visibilityOf(codeValue));
        getWait().until(ExpectedConditions.visibilityOf(category));
        getWait().until(ExpectedConditions.visibilityOf(categoryValue));
        getWait().until(ExpectedConditions.visibilityOf(unit));
        getWait().until(ExpectedConditions.visibilityOf(unitValue));
        getWait().until(ExpectedConditions.visibilityOf(cost));
        getWait().until(ExpectedConditions.visibilityOf(costValue));
        getWait().until(ExpectedConditions.visibilityOf(price));
        getWait().until(ExpectedConditions.visibilityOf(priceValue));
        getWait().until(ExpectedConditions.visibilityOf(taxRate));
        getWait().until(ExpectedConditions.visibilityOf(taxRateValue));
        getWait().until(ExpectedConditions.visibilityOf(taxMethod));
        getWait().until(ExpectedConditions.visibilityOf(taxMethodValue));
        getWait().until(ExpectedConditions.visibilityOf(alertQuantity));
        getWait().until(ExpectedConditions.visibilityOf(alertQuantityValue));
        getWait().until(ExpectedConditions.visibilityOf(productDetail));
        return productImage.isDisplayed() &&
                barcodeQrcode.isDisplayed()&&
                type.getText().equals("Type") &&
                typeValue.getText().equals("Standard") &&
                name.getText().equals("Name") &&
                nameValue.getText().equals("Lemon") &&
                code.getText().equals("Code") &&
                codeValue.getText().equals("FFR03") &&
                category.getText().equals("Category") &&
                categoryValue.getText().equals("Fruits") &&
                unit.getText().equals("Unit") &&
                unitValue.getText().equals("Piece (pc)") &&
                cost.getText().equals("Cost") &&
                costValue.getText().equals("1.95") &&
                price.getText().equals("Price") &&
                priceValue.getText().equals("3.00") &&
                taxRate.getText().equals("Tax Rate") &&
                taxRateValue.getText().equals("GST @0%") &&
                taxMethod.getText().equals("Tax Method") &&
                taxMethodValue.getText().equals("Inclusive") &&
                alertQuantity.getText().equals("Alert Quantity") &&
                alertQuantityValue.getText().equals("5.00") &&
                productDetail.isDisplayed();
    }


}
