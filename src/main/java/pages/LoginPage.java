package pages;

import core.BasePage;
import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "identity")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//div[@class='custom-checkbox']")
    private WebElement rememberCheckBox;

    @FindBy(xpath = "//div[@id='login']//button")
    private WebElement buttonLogin;

    @FindBy(xpath = "//a[text()='click here']")
    private WebElement forgotPassword;

    public void navigateToLogin(String url){
        getDriver().get(url);
    }

    public void login(String u, String p){
        getWait().until(ExpectedConditions.visibilityOf(username));
        username.clear();
        username.sendKeys(u);
        password.clear();
        password.sendKeys(p);
        buttonLogin.click();
    }

    public boolean verifyLoginPage(){
        getWait().until(ExpectedConditions.visibilityOf(username));
        return username.isDisplayed() &&
                password.isDisplayed() &&
                forgotPassword.isDisplayed() &&
                buttonLogin.isDisplayed();
    }

}
