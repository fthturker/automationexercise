package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Case07Page;
import utilities.Driver;
import utilities.Log;

public class VerifyTestCasesPageStepDefinitions {
    Case07Page case07Page=new Case07Page();
    @When("Click on Test Cases button")
    public void click_on_test_cases_button() {
        Driver.waitAndClick(case07Page.testCasesButton,1);
        Driver.wait(1);
        Log.info("Test Vakalari dugmesine tiklandi");
    }
    @When("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        Assert.assertTrue(case07Page.testCasesText.isDisplayed());
        Log.info("kullanicinin testsenaryolari sayfasina basariyla yonlendirildigi dogrulandi");
    }


}
