package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Case09Page;
import utilities.Driver;
import utilities.Log;

public class SearchProductStepdefinitions {
    Case09Page case09Page = new Case09Page();

    @When("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() {
        Driver.waitAndSendText(case09Page.searchProduct, "polo");
        Driver.wait(1);
        Driver.waitAndClick(case09Page.searchButton, 1);
        Driver.wait(1);
        Log.info("Arama girisine urun adi girildi ve ara dügmesi tiklandi");
    }

    @When("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        Assert.assertTrue(case09Page.searchedProductText.isDisplayed());
        Driver.wait(1);
        Log.info("Aranan Urunlerin gorunur oldugu dogrulandi");
    }

    @When("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {

        int expectedCount = 0;
        for (WebElement w : case09Page.productPageAllProductDetailList) {
            if (w.getText().contains("Tshirt") || w.getText().contains("T-Shirt") || w.getText().contains("T SHIRT")) {
                expectedCount++;
            }
        }
        int actualCount = case09Page.productPageSearchResultList.size();
        System.out.println("expected: " + expectedCount + " actual: " + actualCount);
        Assert.assertEquals(expectedCount, actualCount);
        Driver.wait(1);
        Log.info("Aramayla ilgili tum urunlerin gorunur oldugu dogrulandi");
    }

}
