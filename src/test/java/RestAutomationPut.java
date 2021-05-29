import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class RestAutomationPut {
/*Put is used to update the content*/
    @Test(enabled = false)
    public void restAutoPut()
    {
        JSONObject request = new JSONObject();
        request.put("name","morpheus");
        request.put("job","zion resident");
        System.out.println(request);
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).log().all();
    }
    @Test(enabled = true)
    public void restNodeJsAutoPut()
    {
        JSONObject request = new JSONObject();
        request.put("firstName","AbcdPut");
        request.put("lastName","XYZ5");
        request.put("mobileNum",100000000);
        request.put("id",5);
        request.put("xyz",90);


        baseURI="http://localhost:3000/";
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("/Users/5").
                then().
                //statusCode(201).
                log().all();
    }
}
