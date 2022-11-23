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
}
