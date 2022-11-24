package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Case01Page;
import pages.Case12Page;
import pages.Case14Page;
import utilities.Driver;
import utilities.Log;

public class PlaceOrderRegisterWhileCheckoutStepDefinitions {
    Case14Page case14Page = new Case14Page();
    Case12Page case12Page = new Case12Page();
    Case01Page case01Page=new Case01Page();

    Actions actions = new Actions(Driver.getDriver());

    @When("Add products to cart")
    public void add_products_to_cart() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(2);
        actions.moveToElement(case12Page.productPageilkUrunElement).click().perform();
        Driver.wait(2);
        Log.info("Ilk urun sepete ekle tiklandi");

        Driver.waitAndClick(case12Page.viewCartButton, 1);
        Driver.wait(2);
        Log.info("Sepeti Goruntule dugmesine tiklandi");

    }
    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertTrue(case14Page.shoppingCartElement.isDisplayed());
        Log.info("Sepet sayfasinin goruntulendigi dogrulandi");
    }
    @When("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        Driver.waitAndClick(case14Page.proceedToCheckout,1);
        Driver.wait(2);
        Log.info("Odeme islemine devam et tiklandi");
    }

    @And("Click Register Login button")
    public void clickRegisterLoginButton() {
        Driver.waitAndClick(case14Page.registerLoginButton,1);
        Driver.wait(1);
        Log.info("Kayit Ol / Giris Yap dugmesine tiklandi");
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        Driver.waitAndSendText(case01Page.name, "Yavuzz");
        Driver.wait(1);
        Driver.waitAndSendText(case01Page.email, "yavuzturk2505@gmail.com");
        Driver.wait(1);
        Log.info("Adi ve e-posta adresi girildi");
        Driver.waitAndClick(case01Page.signUpButton, 1);
        Driver.wait(2);
        Log.info("Kaydol dugmesine tiklandi");
        Driver.waitAndClick(case01Page.gender, 1);
        Driver.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(2);
        Driver.waitAndSendText(case01Page.password, "1234567");
        Driver.wait(2);

        actions.click(case01Page.days)
                .sendKeys(Keys.TAB).sendKeys("20")
                .sendKeys(Keys.TAB).sendKeys("May")
                .sendKeys(Keys.TAB).sendKeys("2001")
                .sendKeys(Keys.TAB).perform();
        Log.info("doldurma ayrintilari girildi");
        Driver.waitAndClick(case01Page.newsletterButon, 1);
        Driver.wait(1);
        Log.info("Bultenimize kaydolun onay kutusu secildi");
        Driver.waitAndClick(case01Page.uniformButon, 1);
        Driver.wait(1);
        Log.info("Ortaklarimizdan ozel teklifler alin onay kutusu secildi");
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


    @And("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        Driver.waitAndClick(case01Page.createAccountButton, 1);
        Driver.wait(1);
        Log.info("Hesap olustur dugmesine tiklandi");
        String accountCreatedTextText = case01Page.accountCreatedText.getText();
        Assert.assertTrue(accountCreatedTextText.contains("ACCOUNT CREATED!"));
        Log.info("HESAP OLUSTURULDU gorundu");
        Driver.waitAndClick(case01Page.continueButon, 1);
        Driver.wait(1);
        Log.info("Devam dugmesine tiklandi");
    }

    @And("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Assert.assertTrue(case01Page.loggedUsernameText.isDisplayed());
        Driver.wait(1);
        Log.info("Kullanici adi olarak oturum acildi ifadesinin gorunur oldugu dogrulandi");
    }

    @And("Click Cart{int} button")
    public void clickCartButton(int arg0) {
        Driver.waitAndClick(case14Page.headerCartButonu,1);
        Driver.wait(2);
    }

    @And("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        Driver.waitAndClick(case14Page.cardpageProceedCheckOutButonu,1);
        Driver.wait(2);
    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        String expectedData = "YOUR DELIVERY ADDRESS";
        String actualData = case14Page.cardpageAdressYaziElemet.getText();
        System.out.println(expectedData + "\n" + actualData);

        String expectedTitle = "Blue Top";
        String actualTitle = case14Page.cardpageIlkUrunTitle.getText();

        System.out.println(expectedTitle + "\n" + actualTitle);
        Assert.assertTrue(expectedData.equals(actualData));
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        case14Page.cardpageTextArea.sendKeys(Faker.instance().currency().name());
        case14Page.cardPagePlaceOrderButonu.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(case14Page.paymentpagePayAndConfirmOrderButon).
                sendKeys(faker.business().creditCardType()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardNumber()).
                sendKeys(Keys.TAB).
                sendKeys("456").
                sendKeys(Keys.TAB).
                sendKeys(faker.business().creditCardExpiry()).
                sendKeys(Keys.TAB).
                sendKeys("2023").
                perform();
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        case14Page.paymentpagePayAndConfirmOrderButon.click();
    }

    @And("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        String deleteAccountTextText = case01Page.deleteAccountText.getText();
        Assert.assertTrue(deleteAccountTextText.contains("ACCOUNT DELETED!"));
        Driver.wait(2);
        Log.info("Hesabi Silindi gorunur");
        Driver.waitAndClick(case01Page.deleteContinueButton, 1);
        Driver.wait(1);
        Log.info("Devam dugmesine tiklandi");
    }

    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertTrue(case14Page.paymentpageSuccesFullyOrderYaziElement.isDisplayed());
    }
}

