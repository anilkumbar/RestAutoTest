import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class RestAutomationPost {
    /*Post is to create record*/
    @Test(enabled = false)
    public void restAutoPost()
    {

        JSONObject request = new JSONObject();
        request.put("name","Raghav");
        request.put("job","Teacher");
        System.out.println(request);
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post("https://reqres.in/api/users").
        then().
                statusCode(201);
    }
    @Test(enabled = true)
    public void restNodeJsAutoPost()
    {
        JSONObject request = new JSONObject();
        request.put("firstName","Abcd5");
        request.put("lastName","XYZ5");
        request.put("mobileNum",100000000);

        request.put("id",5);

        baseURI="http://localhost:3000/";
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
        when().
                post("/Users").
        then().
                statusCode(201).
                log().all();
    }
}
