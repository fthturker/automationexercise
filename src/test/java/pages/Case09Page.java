package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Case09Page {
    public Case09Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProduct;

    @FindBy(xpath = "//button[@id='submit_search']")
    public WebElement searchButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductText;

    @FindBy(xpath = "//div[@class='features_items']")
    public WebElement allProductSearch;
}
