package stepDefinitions;

import io.cucumber.java.en.When;
import pages.Case11Page;
import utilities.Driver;
import utilities.Log;

public class VerifySubscriptionInCartPageStepDefinitions {
    Case11Page case11Page = new Case11Page();

    @When("Click Cart button")
    public void click_cart_button() {
        Driver.waitAndClick(case11Page.cartButton,1);
        Driver.wait(1);
        Log.info("Sepet dugmesine tiklandi");
    }

}
