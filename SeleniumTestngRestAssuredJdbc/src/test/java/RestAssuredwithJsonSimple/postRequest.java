package RestAssuredwithJsonSimple;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
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

		// print get status code
		//get execution time
		//get body
		//get status line like 200 ok
		//get header with content type for response format
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		
		//Pass and fail Scenario
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 202);
		
	}

}