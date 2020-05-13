package Helpers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TestingRestAPI
{
    String url = "http://localhost:3000/";
    RequestSpecification httpRequest;
    Response response;

    @Test
    public void testingRestApi()
    {
        JSONObject parameters = new JSONObject();
        parameters.put("name", "EdanTeam");
        parameters.put("email", "Edan@gmail.com");

        RestAssured.baseURI = url;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");
        httpRequest.header("Content-Type", "application/json");

        httpRequest.body(parameters.toJSONString());
        response = httpRequest.delete("/api/teams/2");
        //response = httpRequest.put("/api/teams/2");
        //response = httpRequest.post("/api/teams");
        //response = httpRequest.get("/api/teams/search?perpage=50&page=1");
        System.out.println(response.prettyPrint());
    }
}
