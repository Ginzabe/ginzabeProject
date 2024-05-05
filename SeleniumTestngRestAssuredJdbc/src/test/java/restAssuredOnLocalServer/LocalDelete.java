package restAssuredOnLocalServer;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LocalDelete {

	
	@Test
	public void Delete() {
		
		
		baseURI = "http://localhost:3000";
		
		given().
		//if you want to have a header you can tell server your given document type and what kind of document you are looking for
		header("Content-Type","application/json").
		contentType(ContentType.JSON). //type of given document
		accept(ContentType.JSON).//types of document looking for
		when().
				delete("/users/2").
		then().
             statusCode(200);
	}

	
	}
	

