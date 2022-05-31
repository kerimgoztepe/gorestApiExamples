package in.co.gorest.gorestinfo;

import in.co.gorest.model.UpdatePojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class GoRestPatchTest extends TestBase {

    @Test
    public void updateServicesWithPatch() {
        UpdatePojo updatePojo = new UpdatePojo();
        updatePojo.setName("Allasani Peddana");
        updatePojo.setEmail("allasani.peddana415@15ce.com");
        updatePojo.setStatus("active");


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 65cbc4c43040ae97eb012d87fb6bb928809feb842bfeba5ea49b2969ea92ede6")
                .pathParam("id", 13393)
                .body(updatePojo)
                .when()
                .patch("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
