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

    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productsButton;

   // ((//div[@class="productinfo text-center"])//p)[1]
    @FindBy(xpath = "//p[.='Blue Top']")
    public WebElement productpageIlkUrunTitle;
    @FindBy(xpath = "(//a[@class=\"btn btn-default add-to-cart\"])[1]")
    public WebElement productPageilkUrunElement;
    @FindBy(xpath = "//*[@id=\"product-2\"]/td[2]/h4/a")
    public WebElement cardPageFirstProductTitleElement;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement ContinueShoppingButton;

    // (//p[contains(text(),'Men Tshirt')])[2]
    @FindBy(xpath = "//p[.='Men Tshirt']")
    public WebElement ikinciUrunTitle;

    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    public WebElement secondAddTocartButton;

    @FindBy(xpath = "//p[@class='text-center']//a")
    public WebElement viewCartButton;

    @FindBy(css = ".cart_description>h4>a")
    public List<WebElement> productsAddView;

    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement headerCartButonu;

    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement cardpageIlkUrunTitle;
    @FindBy(xpath = "//a[.='Men Tshirt']")
    public WebElement cardPageikinciUrunTitle;

    @FindBy(css = "[name=\"quantity\"]")
    public WebElement detailPageQuantityElement;

    @FindBy(xpath = "(//button[@class=\"disabled\"])[1]")
    public WebElement cardPagefirstProductQuantityNumber;


}
