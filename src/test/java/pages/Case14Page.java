package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.Watchable;

public class Case14Page {
    public Case14Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCartElement;

    @FindBy(xpath = "//a[@class='btn btn-default check_out']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement headerCartButonu;

    @FindBy(css = "[class=\"btn btn-default check_out\"]")
    public WebElement cardpageProceedCheckOutButonu;

    @FindBy(xpath = "//h3[text()='Your delivery address']")
    public WebElement cardpageAdressYaziElemet;

    @FindBy(xpath = "//*[text()='Blue Top']")
    public WebElement cardpageIlkUrunTitle;

    @FindBy(css = "[name=\"message\"]")
    public WebElement cardpageTextArea;

    @FindBy(css = "[class=\"btn btn-default check_out\"]")
    public WebElement cardPagePlaceOrderButonu;

    @FindBy(css = "[data-qa=\"pay-button\"]")
    public WebElement paymentpagePayAndConfirmOrderButon;

    @FindBy(xpath = "//p[.='Congratulations! Your order has been confirmed!']")
    public WebElement paymentpageSuccesFullyOrderYaziElement;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteAccount;
}
