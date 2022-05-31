package in.co.gorest.gorestinfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoRestGetTest extends TestBase {

    @Test
    public void getAllServicesInfo() {
        Response response = given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleServicesInfo() {
        Response response = given()
                .pathParam("id",3814)
                .when()
                .get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
