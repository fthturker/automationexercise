package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case04Page {
    public Case04Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath = "//a[normalize-space()='Logout']")
    public WebElement logoutButton;
}
