package Parameter_project;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Path_parameter {

	@Test
	public void path_parameter() {
		baseURI="http://localhost:8084";
		
		//Step 1: createdata
		given().pathParam("pid", "TY_PROJ_001")
		
		//Step 2: send request body
		.when().get("/projects/{pid}")
		.then()
		.assertThat().statusCode(200).log().all();
		
	}
}
