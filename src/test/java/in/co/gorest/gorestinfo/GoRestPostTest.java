package in.co.gorest.gorestinfo;

import in.co.gorest.model.GoRestPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GoRestPostTest extends TestBase {

    @Test
    public void createUserTest() {

        GoRestPojo goRestPojo = new GoRestPojo();
        goRestPojo.setName("Tenali Ramakrishna");
        goRestPojo.setGender("male");
        goRestPojo.setEmail("tenali.ramakrishna85@15ce.com");
        goRestPojo.setStatus("active");


        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 65cbc4c43040ae97eb012d87fb6bb928809feb842bfeba5ea49b2969ea92ede6")
                .body(goRestPojo)
                .when()
                .post();
       response.prettyPrint();
       response.then().statusCode(201);
  }
}
