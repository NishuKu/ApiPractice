package Parameter_project;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Querr_parameter {

	@Test
	public void query_parameter()
	{
		baseURI="http://localhost:8084";
		
		//step 1: create data
		given()
		.queryParam("page", 2);
		
		//send the request body
		when().get("/api/users")
		
		.then()
		.log().all();
		
	}


}
