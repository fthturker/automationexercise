package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class Case13Page {
    public Case13Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    public WebElement viewProductHomePage;

    @FindBy(xpath = "//p[text()='Category: Women > Tops']")
    public WebElement productdetailsOpened;

    @FindBy(xpath = "//input[@id='quantity']")
    public WebElement quantityIncrease;

    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='disabled']")
    public WebElement quantityIcreaseCartPage;

    @FindBy(css = "[class=\"btn btn-default cart\"]")
    public WebElement detailsPageAddToCardButonu;

}
