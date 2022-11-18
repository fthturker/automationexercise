package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Case08Page;
import utilities.Driver;
import utilities.Log;

public class VerifyAllProductsAndProductDetailPage {
    Actions actions = new Actions(Driver.getDriver());
    Case08Page case08Page = new Case08Page();

    @When("Click on Products button")
    public void click_on_products_button() {
        Driver.waitAndClick(case08Page.productButton, 1);
        Driver.wait(1);
        Log.info("Urunler dugmesine tiklandi");
    }

    @When("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        String expectedPage = "https://www.automationexercise.com/products";
        String actualPage = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedPage, actualPage);
        Driver.wait(2);
        Assert.assertTrue(case08Page.allProductsText.isDisplayed());
        Driver.wait(1);
        Log.info("Kullanıcının TUM URUNLER sayfasina basarıyla gitti");
    }

    @When("The products list is visible")
    public void the_products_list_is_visible() {
         case08Page.urunListVisible.stream().forEach(t-> System.out.println(t.getText()));
    }

    @When("Click on {string} of first product")
    public void click_on_of_first_product(String string) {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.waitAndClick(case08Page.viewProduct, 1);
        Driver.wait(1);
        Log.info("Ilk urunun urunu goruntule tiklandi");
    }

    @When("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String expectedUrl = "https://www.automationexercise.com/product_details/1";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Log.info("Kullanici urun detay sayfasina yonlendirildi");
    }

    @When("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(case08Page.prpductNameText.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(case08Page.categoryText.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(case08Page.pricetext.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(case08Page.availabilityText.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(case08Page.conditionText.isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(case08Page.brandText.isDisplayed());
        Driver.wait(1);
        Log.info("Ayrintilarin gorunur oldugu dogrulandi");
    }
}
