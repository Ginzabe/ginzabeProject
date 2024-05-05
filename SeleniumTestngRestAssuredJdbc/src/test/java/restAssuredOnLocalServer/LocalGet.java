package restAssuredOnLocalServer;

import com.google.common.escape.ArrayBasedUnicodeEscaper;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class LocalGet {

	@Test
	public void get() {
	
		//Base urI
		 baseURI= "http://localhost:3000";
		 
		 given().
		 get("/users").
		 then().statusCode(200).
		 log().all();
		 
	}

	
	
}
