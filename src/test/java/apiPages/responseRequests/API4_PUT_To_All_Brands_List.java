package apiPages.responseRequests;

import apiPages.base_url.AutomatinExerciseBaseUrl;
import apiPages.test_data.AutomationExApiTestData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class API4_PUT_To_All_Brands_List extends AutomatinExerciseBaseUrl {

    @Test
    public void test04(){
        specAutoEx.pathParam("bir","brandsList");

        AutomationExApiTestData apiTestDatam=new AutomationExApiTestData();

        HashMap<String,Object>requestBody=apiTestDatam.autoMationxeIlkPost();

        Response response=given().spec(specAutoEx).contentType(ContentType.JSON)
                .body("Polo").when().put("/{bir}");
        response.prettyPrint();
        response.then().assertThat().statusCode(200);

    }
}
