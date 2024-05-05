package restAssuredwithJsonSimple;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
public class JsonSchemaValidator {

	@Test
	public void testGet() {
		
		baseURI = "https://reqres.in/api/";
		
		given().
		get("/users?page=2").
		then().
		//json schema validator
		//This validation is made for rest.in > get response
		assertThat().body(matchesJsonSchemaInClasspath("schema.json")).
		statusCode(200);
		
		
		
	}
	
}
