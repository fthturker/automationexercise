package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case10Page {
    public Case10Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    public WebElement subscriptionText;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionEmail;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickArrowButton;

    @FindBy(xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")
    public WebElement verifyMessageText;

    @FindBy(css = "[id=\"success-subscribe\"]")
    public WebElement mainpageFooterSuccesScripeYazisi;
}
