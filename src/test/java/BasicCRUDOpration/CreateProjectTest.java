package BasicCRUDOpration;

import java.util.Random;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;
  
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {

	@Test
	public void createProject() { 
		// step 1: create neccessary data
		Random ran=new Random();
		int num= ran.nextInt(2000);
		JSONObject jobj=new JSONObject();
		jobj.put("createObject", "create"+ran);
		jobj.put("projectName", "tyss"+ran);
		
		//step 2: send the request
		RequestSpecification request= RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response resp =request.post("http://localhost:8084/addProject");
		
		//Step 3 : validate the response
		System.out.println(resp.asString());
		
		ValidatableResponse valide = resp.then().log().all();
	}
}
