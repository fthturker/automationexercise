package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Case01Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

public class RegisterUserStepdefinitions {
    Case01Page case01Page = new Case01Page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Launch browser and Navigate to url {string}")
    public void launch_browser_and_navigate_to_url(String string) {
        Log.startTestCase("");
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        Log.info("Anasayfaya gidildi");


    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedUrl = ConfigReader.getProperty("autoEx");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        Log.info("Ana sayfanin basariyla gorunur oldugu dogrulandi");

    }

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        Driver.waitAndClick(case01Page.signUp, 1);
        Driver.wait(1);
        Log.info("Kayıt Ol/Giris Yap dugmesine tıklandı");
    }

    @Given("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(case01Page.newUserSignupTextElement.isDisplayed());
        Log.info("Yeni kullanici Kaydi ni dogrulayin! goruldu");
    }

    @Given("Enter name and email address")
    public void enter_name_and_email_address() {
        Driver.waitAndSendText(case01Page.name, "Yavuz");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.email, "yavuzturk2071@gmail.com");
        //actions.click(case01Page.email).sendKeys(faker.internet().emailAddress()).perform();
        Driver.wait(1);
        Log.info("Adi ve e-posta adresi girildi");

    }

    @Given("Click Signup button")
    public void click_signup_button() {
        Driver.waitAndClick(case01Page.signUpButton, 1);
        Driver.wait(1);
        Log.info("Kaydol dugmesine tiklandi");
    }

    @Given("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        String enterAccountInfoText = case01Page.enterAccountInfoTextElement.getText();
        Assert.assertTrue(enterAccountInfoText.contains("ENTER ACCOUNT INFORMATION"));
        Log.info("HESAP BILGILERINI GIRIN ifadesinin gorunur oldugu dogrulandi");
    }

    @Given("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        Driver.waitAndClick(case01Page.gender, 1);
        Driver.wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.password, "1234567");
        Driver.wait(1);

        actions.click(case01Page.days)
                .sendKeys(Keys.TAB).sendKeys("20")
                .sendKeys(Keys.TAB).sendKeys("May")
                .sendKeys(Keys.TAB).sendKeys("2001")
                .sendKeys(Keys.TAB).perform();
        Log.info("doldurma ayrintilari girildi");
    }

    @Given("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        Driver.waitAndClick(case01Page.newsletterButon, 1);
        Driver.wait(1);
        Log.info("Bultenimize kaydolun onay kutusu secildi");
    }

    @Given("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        Driver.waitAndClick(case01Page.uniformButon, 1);
        Driver.wait(1);
        Log.info("Ortaklarimizdan ozel teklifler alin onay kutusu secildi");
    }

    @Given("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        Driver.waitAndSendText(case01Page.firstName, "Yavuz");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.lastName, "Turker");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.company, "EXercise");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.address1, "Mehmet apt. istiklal sok. no:16");
        Driver.wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.address2, "pınar sit. a blok d:36");
        Driver.wait(1);
        actions.click(case01Page.country)
                .sendKeys("Canada").perform();
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.state, "Marmara");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.city, "Istanbul");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.zipcode, "34757");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.mobileNumber, "053212345678");
        Driver.wait(1);
        Log.info("doldurma ayrintilari girildi");
    }

    @Given("Click Create Account button")
    public void click_create_account_button() {
        Driver.waitAndClick(case01Page.createAccountButton, 1);
        Driver.wait(1);
        Log.info("Hesap olustur dugmesine tiklandi");
    }

    @Given("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        String accountCreatedTextText = case01Page.accountCreatedText.getText();
        Assert.assertTrue(accountCreatedTextText.contains("ACCOUNT CREATED!"));
        Log.info("HESAP OLUSTURULDU gorundu");

    }

    @Given("Click Continue button")
    public void click_continue_button() {
        Driver.waitAndClick(case01Page.continueButon, 1);
        Driver.wait(1);
        Log.info("Devam dugmesine tiklandi");
    }

    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(case01Page.loggedUsernameText.isDisplayed());
        Driver.wait(1);
        Log.info("Kullanici adi olarak oturum acildi ifadesinin gorunur oldugu dogrulandi");
    }

    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        Driver.waitAndClick(case01Page.deleteAccount, 1);
        Driver.wait(1);
        Log.info("Hesabi Sil dugmesi tiklandi");
    }

    @Given("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        String deleteAccountTextText = case01Page.deleteAccountText.getText();
        Assert.assertTrue(deleteAccountTextText.contains("ACCOUNT DELETED!"));
        Driver.wait(2);
        Log.info("Hesabi Silindi gorunur");
        Driver.waitAndClick(case01Page.deleteContinueButton, 1);
        Driver.wait(1);
        Log.info("Devam dugmesine tiklandi");
    }

    @Given("Close browser")
    public void close_browser() {
        Driver.closeDriver();
        Log.info("Sayfa kapatilir");
        Log.endTestCase("");
    }
}

