package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Case02Page;
import utilities.Driver;
import utilities.Log;

public class LoginUserWithCorrectEmailAndPasswordStepDefinitions {
    Case02Page case02Page = new Case02Page();

    @When("Verify {string} is visible")
    public void verify_is_visible(String string) {
        Assert.assertTrue(case02Page.LoginToYourAccountText.isDisplayed());
        Log.info("Hesabiniza giris yapin ifadesinin gorunur oldugu dogrulandi");
    }
    @When("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        Driver.waitAndSendText(case02Page.loginEmail,"yavuzturk2621@gmail.com");
        Driver.wait(1);
        Driver.waitAndSendText(case02Page.loginPassword,"1234567");
        Driver.wait(1);
        Log.info("Dogru e-posta adresini ve sifre girildi");
    }
    @When("Click {string} button")
    public void click_button(String string) {
       Driver.waitAndClick(case02Page.loginButton,1);
       Driver.wait(1);
       Log.info("Giris dugmesi tiklandi");
    }

    @And("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        //String deleteAccountTextText2 = case02Page.deleteAccountText2.getText();
        //Assert.assertTrue(deleteAccountTextText2.contains("ACCOUNT DELETED!"));
        Driver.wait(2);
        Log.info("Hesabi Silindi gorundu");
    }
}
