package BasicCRUDOpration;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetProjectTest {

	 @Test
	 public void getProject() {
		 Response res= RestAssured.get("http://localhost8084");
		 RequestSpecification resp = RestAssured.given();
		 
		 ValidatableResponse validate = res.then().log().all();
	 }
}
