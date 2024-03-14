package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PurchasesListPage extends BasePage {

    public PurchasesListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//tbody[@role='alert']//tr[@class='purchase_link']//td[@class=' sorting_1']")
    private WebElement dateColumn;

    @FindBy(xpath = "//tr[@class='active']//th[text()='Reference No']")
    private WebElement reference;

    @FindBy(xpath = "//tbody[@role='alert']//tr")
    private List<WebElement> displayPurchases;

    public boolean verifyListPurchases(){
        getWait().until(ExpectedConditions.visibilityOf(dateColumn));
        getWait().until(ExpectedConditions.visibilityOf(reference));
        boolean verifydisplayPurchases = false;
        if(displayPurchases.size() == 9){
            verifydisplayPurchases = true;
        }
        return dateColumn.getText().matches("['^\\d{2}/\\d{2}/\\d{4} \\d{2}:\\d{2}:\\d{2}$']") &&
                reference.isDisplayed() && verifydisplayPurchases;
    }

}
