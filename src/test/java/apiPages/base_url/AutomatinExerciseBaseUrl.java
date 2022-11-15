package apiPages.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class AutomatinExerciseBaseUrl {

    protected RequestSpecification specAutoEx;

    @Before
    public void setup() {
        specAutoEx = new RequestSpecBuilder().setBaseUri("https://www.automationexercise.com/api").build();


    }
}