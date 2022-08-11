package CRUDOprationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllProjects {

	@Test
	public void getAllProjects() {

		baseURI="http://localhost";
		port=8084;
		
		//Step 1: Create neccssary data 
		//Step 2: Send the request
		when()
		.get("/projects")
		.then()
		.assertThat().statusCode(200).log().all();
	}
}
