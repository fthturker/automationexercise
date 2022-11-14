package stepDefinitions;

;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Case02Page;
import pages.Case03Page;
import utilities.Driver;
import utilities.Log;

public class LoginUserWithIncorrectEmailAndPasswordStepDefinitions {
    Case02Page case02Page=new Case02Page();
    Case03Page case03Page = new Case03Page();
    @When("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        Driver.waitAndSendText(case02Page.loginEmail,"yavuzturk2011@gmail.com");
        Driver.wait(1);
        Driver.waitAndSendText(case02Page.loginPassword,"12345");
        Driver.wait(1);
        Log.info("Yanlis e-posta adresi ve sifre girildi");
    }
    @When("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        String yourEmailOrPasswordIsIncorrectTextText = case03Page.YourEmailOrPasswordIsIncorrectText.getText();
        Assert.assertTrue(yourEmailOrPasswordIsIncorrectTextText.contains("Your email or password is incorrect!"));
        Driver.wait(2);

        Assert.assertTrue(case03Page.YourEmailOrPasswordIsIncorrectText.isDisplayed());
        Log.info("E-postaniz veya sifreniz yanlis hatasi dogrulandi ve goruldu");
    }



}
