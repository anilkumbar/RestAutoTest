import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class RestAutomationDelete {

    /*Delete is used to Delete the content */
    @Test(enabled = true)
    public void restAutoDelete()
    {
        when().
                delete("https://reqres.in/api/users/2").
        then().
                statusCode(204).
                log().all();

    }
    @Test(enabled = false)
    public void restNodeJsAutoDelete()
    {
        JSONObject request = new JSONObject();
        request.put("mobileNum","100");

        //request.put("lastName","XYZ5");
        //request.put("mobileNum",100000000);
        //request.put("id",5);
        //request.put("xyz",90);

        baseURI="http://localhost:3000/";
//        given().
//                header("Content-Type", "application/json").
//                contentType(ContentType.JSON).
//                accept(ContentType.JSON).
//                body(request.toJSONString()).
//                when().
//                patch("/Users/5").
//                then().
//                statusCode(200).
//                log().all();
            }
}
