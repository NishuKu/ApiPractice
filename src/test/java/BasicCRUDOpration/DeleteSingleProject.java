package BasicCRUDOpration;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteSingleProject {

	@Test
	public void deleteSingleProject() {
		
		Response resp = RestAssured.delete("http://localhost:8084/employees/TYP_00001");
			ValidatableResponse validate = resp.then();
			validate.log().all();
		
		
	}
}
