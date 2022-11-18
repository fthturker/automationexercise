package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Case12Page;
import utilities.Driver;
import utilities.Log;
import utilities.ReUsableMethods;


public class AddProductsInCartStepDefinitions {
    Case12Page case12Page = new Case12Page();
    static String ilkUrun;
    static String ikinciUrun;

    @When("Click Products button")
    public void click_products_button() {
        Driver.waitAndClick(case12Page.productsButton, 1);
        Driver.wait(1);
        Log.info("Urunler dugmesine tiklandi");
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);

        actions.moveToElement(case12Page.productPageilkUrunElement).click().perform();

        ilkUrun = case12Page.productpageIlkUrunTitle.getText();
        Driver.wait(1);
        Log.info("Ilk urunun uzerine gelindi ve sepete ekle tiklandi");
    }

    @When("Click Continue Shopping button")
    public void click_continue_shopping_button() {
        Driver.waitAndClick(case12Page.ContinueShoppingButton, 1);
        Driver.wait(1);
        Log.info("Alisverise Devam Et dugmesine tiklandi");
    }

    @When("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {
        ikinciUrun = case12Page.ikinciUrunTitle.getText();
        case12Page.headerCartButonu.sendKeys(Keys.PAGE_DOWN);

        ReUsableMethods.hover(case12Page.secondAddTocartButton);
        ReUsableMethods.waitFor(2);
        case12Page.secondAddTocartButton.click();
        Driver.wait(1);
        Log.info("Fareyi ikinci urunun uzerine getirin ve Sepete ekle yi tiklayin");
    }

    @When("Click View Cart button")
    public void click_view_cart_button() {
        Driver.waitAndClick(case12Page.viewCartButton, 1);
        Driver.wait(1);
        Log.info("Sepeti Goruntule dugmesine tiklandi");
    }

    @When("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {
        //Assert.assertTrue(case12Page.productpageIlkUrunTitle.getText().equals(case12Page.cardpageIlkUrunTitle));
        //Assert.assertTrue(case12Page.ikinciUrunTitle.getText().equals(case12Page.cardPageikinciUrunTitle));

    }


    @When("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        int miktar = 0;
        Actions actions = new Actions(Driver.getDriver());
        actions.click(case12Page.detailPageQuantityElement).doubleClick().sendKeys(miktar + "").perform();

        ReUsableMethods.waitFor(3);
        String actual = case12Page.cardPagefirstProductQuantityNumber.getText();
        String expected = miktar + "";
        System.out.println(actual);
        Assert.assertTrue(actual.equals(expected));

    }

}
