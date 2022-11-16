package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case01Page {
    public Case01Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement signUp;

    @FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
    public WebElement newUserSignupTextElement;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    public WebElement enterAccountInfoTextElement;

    @FindBy(xpath = "(//input[@name='title'])[2]")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement days;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletterButon;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement uniformButon;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(linkText = "Continue")
    public WebElement continueButon;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedUsernameText;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement deleteAccountText;

    @FindBy(css = "[data-target=\"#deleteModal\"]")
    public WebElement deleteContinueButton;

}
