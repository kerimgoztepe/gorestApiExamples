package in.co.gorest.gorestinfo;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class ReqResDelete {


       private final static String CLIENT_ID = "front-service";
       private final static String CLIENT_PASSWORD = "4k2p5LLIGNcOGNEtU76oMqS4eycTiQfpgYwKf4HB3wMMpMmsdQOPmekGb6Kwb7c";
       private final static String BASE_URL = "http://staging.shvp-xftw-ctdtm.com";


    //@BeforeClass
    //public void SetUpClass() {
    //    baseURI = "http://staging.shvp-xftw-ctdtm.com";


    @Test
    public void  getToken() {
        Response response = given().auth().basic(CLIENT_ID, CLIENT_PASSWORD).
                formParams("grant_type", "password").
                formParams("username", "superadmin").
                formParams("password", "T3st123!").
                when().
                baseUri(BASE_URL).
                post("/platform/accounts-service/oauth/token");
        response.then().assertThat().
                statusCode(200).
                body("access_token", notNullValue()).
                log().ifError();
        System.out.println(response.prettyPrint());
        //return response.jsonPath().getString("access_token");
    }


}



