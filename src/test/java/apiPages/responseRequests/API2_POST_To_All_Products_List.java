package apiPages.responseRequests;

import apiPages.base_url.AutomatinExerciseBaseUrl;
import apiPages.test_data.AutomationExApiTestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class API2_POST_To_All_Products_List extends AutomatinExerciseBaseUrl {

    @Test
    public void test02(){
        specAutoEx.pathParam("bir","productList");
        AutomationExApiTestData aeptd=new AutomationExApiTestData();
        HashMap<String ,Object>requestData=aeptd.autoMationxeIlkPost();


        Response response=given().spec(specAutoEx).
                contentType(ContentType.JSON).body(requestData).when().post("/{bir}");

       // response.prettyPrint();
   response.then().assertThat().statusCode(405);


    }
}
