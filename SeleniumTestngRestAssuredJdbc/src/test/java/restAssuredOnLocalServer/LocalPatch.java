package restAssuredOnLocalServer;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class LocalPatch {

	@Test
	public void Patch() {
		JSONObject request = new JSONObject();
		
		
		request.put("lastName", "Jackson");
		request.put("subjectId", 2);
		
		baseURI = "http://localhost:3000";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("/users/1").
		then().
		statusCode(200);
	}
	
}
