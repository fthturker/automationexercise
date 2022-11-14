package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case08Page {
    public Case08Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsText;

    @FindBy(css = "//div[@class='features_items']")
    public WebElement urunListVisible;

    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    public WebElement viewProduct;

    @FindBy(xpath = "//h2[normalize-space()='Blue Top']")
    public WebElement prpductNameText;

    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    public WebElement categoryText;

    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    public WebElement pricetext;

    @FindBy(xpath = "//b[normalize-space()='Availability:']")
    public WebElement availabilityText;

    @FindBy(xpath = "//b[normalize-space()='Condition:']")
    public WebElement conditionText;

    @FindBy(xpath = "//b[normalize-space()='Brand:']")
    public WebElement brandText;

}
