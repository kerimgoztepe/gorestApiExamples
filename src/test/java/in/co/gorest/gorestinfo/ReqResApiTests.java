package in.co.gorest.gorestinfo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class ReqResApiTests {

   // @BeforeClass
   // public void SetUpClass(){
   //     baseURI="https://reqres.in/api";



    String baseURL = "https://reqres.in/api";

    @Test
    public void test1(){
        // RestAssured.get(spartanBaseURL+"/api/spartans");
        Response response = RestAssured.get(baseURL + "/users");

        //print the status code
        System.out.println(response.statusCode());


        //print body
        System.out.println(response.body().prettyPrint());
    }




}
