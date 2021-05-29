import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RestAutomation {
    @Test(enabled = true)
    public void restTest()
    {

        Response response =RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getBody().toString());
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getTime());
        Assert.assertEquals(response.getStatusCode(),200);
    }
    @Test(enabled = false)
    public void restTest_2()
    {
//        given()
//                .get("https://reqres.in/api/users?page=2")
//        .then()
//                .statusCode(200)
//                .body("data.id[0]",equalTo(7))
//                .body("data.first_name",hasItems("Michael","Lindsay"));

        baseURI ="https://reqres.in/api/";
    given()
            .param("data.id[0]","7")
            .get("users?page=2").
    then()
            .statusCode(200)
            .body("data.id[0]", equalTo(7))
            .body("data.last_name", hasItems("Lawson"))
            .body("page", equalTo(2))
            .log().all();
    }
    @Test(enabled = false)
    public void restNodeJsAutoGet()
    {
        baseURI="http://localhost:3000/";
        given().
                param("name","Automaiton").

                get("/Subjects").
                then().
                statusCode(200).
                log().all();
    }

   // @Test()
    public  void restNodeJsAuto2Get(){

        JSONObject jsonObject= new JSONObject();
        jsonObject.put("firstName","Shivu");
        jsonObject.put("lastName","Shivu");
        jsonObject.put("mobileNum","200");
        jsonObject.put("firstName","Shivu");
        baseURI="http://localhost:3000/";
       given()
               .contentType(ContentType.JSON)
               .accept(ContentType.JSON)
               .header("Contect-Type","application/json")
               .body(jsonObject.toJSONString())
               .post("/Users").then().statusCode(201);
    }
   // @Test()
    public  void restNodeJsAutoPut(){

        JSONObject jsonObject= new JSONObject();
        jsonObject.put("firstName","Shivu");
        jsonObject.put("lastName","Shivu");
        jsonObject.put("mobileNum","200");
        baseURI="http://localhost:3000/";
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Contect-Type","application/json")
                .body(jsonObject.toJSONString())
                .put("/Users/8").then().statusCode(200);
    }
//    @Test()
    public  void restNodeJsAutoDelete(){

         baseURI="http://localhost:3000/";
        given().params("id","11")
                .delete("Users")
                .then()
                .statusCode(200);
    }
}
