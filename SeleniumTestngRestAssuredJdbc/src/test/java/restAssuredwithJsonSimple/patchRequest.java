package restAssuredwithJsonSimple;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class patchRequest {

	public class PutRequest {
		@Test
		public void testPutch() {
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
			when().patch("/users/2").
			then().statusCode(200).
			log().all();//to see the created body, id and time 
		}
}
}
