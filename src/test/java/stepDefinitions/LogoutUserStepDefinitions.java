package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Case02Page;
import pages.Case04Page;
import utilities.Driver;
import utilities.Log;

public class LogoutUserStepDefinitions {
    Case02Page case02Page = new Case02Page();
    Case04Page case04Page = new Case04Page();

    @When("Click Logout button")
    public void click_logout_button() {
        Driver.waitAndClick(case04Page.logoutButton, 1);
        Driver.wait(1);
        Log.info("Cıkıs dugmesi tiklandi");
    }

    @When("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertTrue(case02Page.LoginToYourAccountText.isDisplayed());
        Log.info("Kullanicinin oturum acma sayfasina yonlendirildigi dogrulandi");
    }
}
