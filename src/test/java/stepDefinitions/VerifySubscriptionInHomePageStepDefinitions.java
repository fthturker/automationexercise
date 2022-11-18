package stepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Case10Page;
import utilities.Driver;
import utilities.Log;

public class VerifySubscriptionInHomePageStepDefinitions {
    Case10Page case10Page = new Case10Page();
    Actions actions=new Actions(Driver.getDriver());

    @When("Scroll down to footer")
    public void scroll_down_to_footer() {
        actions.
                sendKeys(Keys.END).
                perform();
        Driver.wait(1);
        Log.info("Altbilgiye ilerlendi");
    }
    @When("Verify text SUBSCRIPTION")
    public void verify_text_subscrıptıon() {
        String expedtedText=case10Page.subscriptionText.getText();
        Assert.assertTrue(expedtedText.contains("SUBSCRIPTION"));
        Log.info("Abonelik metni dogrulandi");
    }
    @When("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        Driver.waitAndSendText(case10Page.subscriptionEmail,"fthturker80@gmail.com");
        Driver.wait(1);
        Driver.waitAndClick(case10Page.clickArrowButton,1);
        Driver.wait(1);
        Log.info("Girise e-posta adresi girildi ve ok dugmesine basildi");
    }
    @When("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        Assert.assertTrue(case10Page.mainpageFooterSuccesScripeYazisi.isDisplayed());
        Log.info("Basariyla abone oldunuz mesaji dogrulandi");
    }

}
