package restAssuredwithJsonSimple;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class getRequest {

	@Test()
	public void getrequest1() {
		// get API request end point
		Response response = get("https://reqres.in/api/users?page=2");

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
		Assert.assertEquals(statusCode, 200);
					
		}
		
	@Test
	public void getrequest2() {
		
		//base url
		
		baseURI = "https://reqres.in/api/";
		
		// // Send a GET request to the specified end point
		// validate status code
		//body data for id 8
		//return all response data with log.all
		
		given().
		get("users?page=2").
		then().
		statusCode(200).
		
		//use this rest assured format to get a body --- .body("lotto.lottoId", equalTo(5));
	    //use Json path finder to get body data
		body("data[1].id", equalTo(8)).
		log().all();
	
	}

}