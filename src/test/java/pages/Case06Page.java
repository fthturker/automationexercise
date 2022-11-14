package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case06Page {
    public Case06Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement getInTouchText;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement nameText;

    @FindBy(xpath = "(//input[@placeholder='Email']")
    public WebElement emailText;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectText;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement messageText;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement alertSuccessText;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    public WebElement homeButton;

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    public WebElement homeImg;

}

