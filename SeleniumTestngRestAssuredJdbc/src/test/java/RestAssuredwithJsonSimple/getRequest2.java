package RestAssuredwithJsonSimple;

import org.testng.annotations.Test;
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
		body("data[1].id", equalTo(8));
		
	}
}
