package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Case12Page;
import utilities.Driver;
import utilities.Log;

public class AddProductsInCartStepDefinitions {
    Case12Page case12Page = new Case12Page();

    @When("Click Products button")
    public void click_products_button() {
        Driver.waitAndClick(case12Page.productsButton, 1);
        Driver.wait(1);
        Log.info("Urunler dugmesine tiklandi");
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        Driver.waitAndClick(case12Page.firstAddToCartButton, 1);
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
        Driver.waitAndClick(case12Page.secondAddTocartButton, 1);
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
