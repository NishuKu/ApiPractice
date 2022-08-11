package BasicCRUDOpration;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllEmployees {

	@Test
	public void getAllEmployees() {
		Response res= RestAssured.get("http://localhost:8084/employees");

		ValidatableResponse validate = res.then().log().all();
		validate.log().all();

	}
}
