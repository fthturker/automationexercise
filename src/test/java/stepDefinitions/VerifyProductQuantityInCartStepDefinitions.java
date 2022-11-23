package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Case13Page;
import utilities.Driver;
import utilities.Log;

public class VerifyProductQuantityInCartStepDefinitions {
    Actions actions = new Actions(Driver.getDriver());
    Case13Page case13Page = new Case13Page();

    @When("Click {string} for any product on home page")
    public void click_for_any_product_on_home_page(String string) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.waitAndClick(case13Page.viewProductHomePage, 1);
        Driver.wait(1);
        Log.info("Anasayfadaki herhangi bir urun icin Urunu Goruntule tiklandi");
    }

    @When("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        Assert.assertTrue(case13Page.productdetailsOpened.isDisplayed());
        Log.info("Urun detayinin acildigi dogrulandi");
    }

    @When("Increase quantity to {int}")
    public void ıncrease_quantity_to(int miktar) {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(case13Page.quantityIncrease).doubleClick().sendKeys(miktar + "").perform();
        Driver.wait(1);
        Log.info("Miktar 4 e yukseltildi");
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        Driver.waitAndClick(case13Page.detailsPageAddToCardButonu, 1);
        Driver.wait(1);
        Log.info("Sepete ekle dugmesi tiklandi");
    }

    @When("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
        Driver.waitAndClick(case13Page.addToCartButton, 1);
        Driver.wait(1);
        Log.info("Sepete ekle dugmesine tiklandi");
    }

    @And("Verify thatt product is displayed in cart page with {int} exact quantity")
    public void verifyThattProductIsDisplayedInCartPageWithExactQuantity(int miktar) {
        String actual = case13Page.quantityIcreaseCartPage.getText();
        String expected = miktar + "";
        System.out.println(actual);
        Assert.assertTrue(actual.equals(expected));
        Log.info("Sepet sayfasinda urunun tam miktar ile goruntulendigi dogrulandi");
    }
}
