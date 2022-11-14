package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case02Page {
    public Case02Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    public WebElement LoginToYourAccountText;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement loginPassword;


    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement loginButton;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    public WebElement deleteAccountText2;
}
