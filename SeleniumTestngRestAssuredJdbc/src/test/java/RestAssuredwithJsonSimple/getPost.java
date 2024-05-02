package RestAssuredwithJsonSimple;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class getPost {

	@Test()
	
	public void testPost() {
		//create payload or body first
		//form body we have key = always string/ex. name and value can be anything so better provide an object = string/ex. morpheus
		Map<String,Object> map = new HashMap<String ,Object>();
		//if you want to see json format at the output 
		map.put("name", "Sam"); //manually you can "\"name\"" or install json simple dependency
		map.put("job", "Computer");
		
		System.out.println(map);
		
		//after install json-simple dependency use this syntax
		JSONObject postRequest = new JSONObject(map);
		
		System.out.println(postRequest);
		
	}
}
