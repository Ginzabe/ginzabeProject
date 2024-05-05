package restAssuredOnLocalServer;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class LocalPost {
	
@Test
public void Post() {
	JSONObject request = new JSONObject();
	
	request.put("firstName", "Sara");
	request.put("lastName", "Abera");
	request.put("subjectId", 1);
	
	baseURI = "http://localhost:3000";
	
	given().
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(request.toJSONString()).
	when().
	post("/users").
	then().
	statusCode(201);
}
}
