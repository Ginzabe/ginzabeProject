package restAssuredwithJsonSimple;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteRequest {
	
	public class PutRequest {
		@Test
		public void testDelete() {
			
		//Base URI
			baseURI = "https://reqres.in/api/";
		
			given().
			//if you want to have a header you can tell server your given document type and what kind of document you are looking for
			header("Content-Type","application/json").
			contentType(ContentType.JSON). //type of given document
			accept(ContentType.JSON).//types of document looking for
			
			when().delete("/users/2").
			then().statusCode(204).
			log().all();//to see the created body, id and time 
		}
}

}
