package stepDefinitions;


import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Case01Page;
import pages.Case05Page;
import utilities.Driver;
import utilities.Log;

public class RegisterUserWithExistingEmailStepDefinitions {
    Case05Page case05Page = new Case05Page();
    Case01Page case01Page=new Case01Page();
    @When("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
        Driver.waitAndSendText(case01Page.name, "Yavuz");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.email,"yavuzturk2010@gmail.com");
        Driver.wait(1);

        Log.info("Adi ve kayitli e-posta adresi girildi");

    }
    @When("Verify error Email Address already exist! is visible")
    public void verify_error_email_address_already_exist_is_visible() {
        String emailAddressAlreadyExistTextText = case05Page.emailAddressAlreadyExistText.getText();
        Assert.assertTrue(emailAddressAlreadyExistTextText.contains("Email Address already exist!"));
        Driver.wait(1);
        Assert.assertTrue(case05Page.emailAddressAlreadyExistText.isDisplayed());
        Driver.wait(1);
        Log.info("E-posta adresi zaten var! hatasi dofrulandi ve goruldu");
    }


}
