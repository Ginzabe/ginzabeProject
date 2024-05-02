package RestAssuredwithJsonSimple;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class getRequest2 {

	@Test
	public void testGet() {
		
		baseURI = "https://reqres.in/api/";
		
		given().
		get("/users?page=2").
		then().statusCode(200).
		body("data[1].id", equalTo(8)). //find by id 8
		log().all(). // if you want log the content
		body("data[4].first_name", equalTo("George")).
		//find by first name
		body("data.first_name",hasItems("George","Rachel")); // find by multiple first name
		
		
	}


	}

