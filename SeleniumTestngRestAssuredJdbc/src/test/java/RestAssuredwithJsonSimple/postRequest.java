package RestAssuredwithJsonSimple;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//import io.restassured.RestAssured.*;
//io.restassured.matcher.RestAssuredMatchers.*;
//org.hamcrest.Matchers.*;
public class postRequest {

	@Test()
	public void getrequest1() {
		// get API request end point
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");

		// print get status code and time
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
	}

}