package BasicCRUDOpration;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateEmployee {

	@Test
public void CreateEmployee() {
		JSONObject obj=new JSONObject();
		obj.put("designation", "QA");
		obj.put("dob", "01/11/1111");
		obj.put("email", "john123@gmail.com");
		obj.put("empName", "john4546");
		obj.put("experience", 2);
		obj.put("mobileNo", "1234567890");
		obj.put("password", "john@123");
		obj.put("project", "rmg");
		obj.put("role","QA");
		obj.put("username","john678");
		
		RequestSpecification request = RestAssured.given();
		request.body(obj);
		request.contentType(ContentType.JSON);
		Response post = request.post("http://localhost:8084/employees");
		
		System.out.println(post.asString());
		ValidatableResponse validate = post.then().log().all();
		validate.log().all();
		
		
		
	}
}
