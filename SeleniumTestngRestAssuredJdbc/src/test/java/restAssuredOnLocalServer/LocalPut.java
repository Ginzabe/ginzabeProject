package restAssuredOnLocalServer;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class LocalPut {

	@Test
	public void Put() {
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Mekdes");
		request.put("lastName", "Willson");
		request.put("subjectId", 2);
		
		baseURI = "http://localhost:3000";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/users/e0dd").
		then().
		statusCode(200);
	}
	
}
