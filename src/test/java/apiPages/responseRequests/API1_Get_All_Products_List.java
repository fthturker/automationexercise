package apiPages.responseRequests;

import apiPages.base_url.AutomatinExerciseBaseUrl;
import io.opentelemetry.api.trace.StatusCode;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API1_Get_All_Products_List extends AutomatinExerciseBaseUrl {
//https://automationexercise.com/api/productsList
  @Test
    public void test01(){
      specAutoEx.pathParam("bir","productsList");

      Response response=given().spec(specAutoEx).when().get("/{bir}");

      response.prettyPeek();
      Assert.assertTrue(response.statusCode()==200);
  }

}
