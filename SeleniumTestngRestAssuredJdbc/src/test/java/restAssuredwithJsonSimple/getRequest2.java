package restAssuredwithJsonSimple;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

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

