package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Case06Page;
import utilities.Driver;
import utilities.Log;


public class ContactUsFromStepDefinitions {
    Case06Page case06Page = new Case06Page();
    Actions actions = new Actions(Driver.getDriver());

    @When("Click on {string} button")
    public void click_on_button(String string) {
        Driver.waitAndClick(case06Page.contactUsButton, 1);
        Driver.wait(1);
        Log.info("Bize Ulasin dugmesine tiklandi");
    }

    @When("Verify GET IN TOUCH is visible")
    public void verify_get_ın_touch_is_visible() {
        Assert.assertTrue(case06Page.getInTouchText.isDisplayed());
        Driver.wait(1);
        Log.info("GET IN TOUCH un gorunur oldugu dogrulandi");
    }

    @When("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() {
        actions.
                click(case06Page.nameText).
                sendKeys("Yavuz").
                sendKeys(Keys.TAB).
                sendKeys("yavuzturk2012@gmail.com").
                perform();
        Driver.wait(1);
        Driver.waitAndSendText(case06Page.subjectText, "Merhaba");
        Driver.wait(1);
        Driver.waitAndSendText(case06Page.messageText, "Seviyorum seni");
        Driver.wait(1);
        Log.info("Adi e-posta adresi konu ve mesaj girildi");
    }

    @When("Upload file")
    public void upload_file() {
        Driver.waitAndSendText(case06Page.uploadFile, "C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\Congratulations!.png");
        Driver.wait(2);
        Log.info("Dosya yuklendi");
    }

    @When("Click Submit button")
    public void click_submit_button() {
        Driver.waitAndClick(case06Page.submitButton, 1);
        Driver.wait(2);
        Log.info("Gonder dugmesine tiklandi");
    }

    @When("Click OK button")
    public void click_ok_button() {
        Driver.wait(2);
        Driver.getDriver().switchTo().alert().accept();
        Log.info("Tamam dugmesine tiklandi");

    }

    @When("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        Assert.assertTrue(case06Page.alertSuccessText.isDisplayed());
        Log.info("Success! Bilgileriniz basariyla gonderildi gorunur");
    }

    @When("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {
        Driver.waitAndClick(case06Page.homeButton, 1);
        Driver.wait(1);
        Assert.assertTrue(case06Page.homeImg.isDisplayed());
        Driver.wait(2);
        Log.info("Anasayfa dugmesine tiklandi ve basariyla indigi goruldu");
    }
}
