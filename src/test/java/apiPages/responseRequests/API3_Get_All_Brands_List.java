package apiPages.responseRequests;

import apiPages.base_url.AutomatinExerciseBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class API3_Get_All_Brands_List extends AutomatinExerciseBaseUrl {
    @Test
    public void test03(){
        specAutoEx.pathParam("bir","brandsList");

        Response response=given().spec(specAutoEx).contentType(ContentType.JSON).when().get("/{bir}");

        response.prettyPrint();
        response.then().assertThat().statusCode(200);

    }
}
