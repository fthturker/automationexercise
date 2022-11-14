package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Case12Page {
    public Case12Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsButton;

    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    public WebElement firstAddToCartButton;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement ContinueShoppingButton;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    public WebElement secondAddTocartButton;

    @FindBy(xpath = "//p[@class='text-center']//a")
    public WebElement viewCartButton;

    @FindBy(xpath = "//div[@id='cart_info']")
    public List<WebElement> productsAddView;


}
