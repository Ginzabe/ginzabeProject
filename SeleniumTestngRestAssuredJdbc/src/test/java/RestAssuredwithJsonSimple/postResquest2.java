package RestAssuredwithJsonSimple;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postResquest2 {

	@Test
	public void testPost() {
		///post request without map java package best method
	
		JSONObject request = new JSONObject();
		request.put("name","Sam");
		request.put("Job", "Computer");
		
		System.out.println(request.toJSONString());
	
	//Base URI
		baseURI = "https://reqres.in/api/";
	
		given().
		//if you want to have a header you can tell server your given document type and what kind of document you are looking for
		header("Content-Type","application/json").
		contentType(ContentType.JSON). //type of given document
		accept(ContentType.JSON).//types of document looking for
		body(request.toJSONString()).
		when().post("/users").
		then().statusCode(201).
		log().all();//to see the created body, id and time 
	}
}
