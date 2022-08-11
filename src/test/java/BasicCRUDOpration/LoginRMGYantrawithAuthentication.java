package BasicCRUDOpration;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithAuthentication {

	@Test
	public void loginRMGYantrawithAuthentication() {

		
		RequestSpecification resp = RestAssured.given();

		resp.auth().basic("rmgyantra", "rmgy@9999");
		Response res= resp.get("http://localhost:8084/login");

		ValidatableResponse validate = res.then().log().all();
		validate.log().all();
	}
}
