package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {

	@Test
	public void basicAuth() {
		baseURI="http://localhost:8084";
		//Step 1: Create Prerquest
		given()
		.auth()
		.basic("rmgyantra", "rmgy@9999")
		
		.when().get("/login")
		.then().assertThat().statusCode(202).log().all();
		
	}
	@Test
	public void basicPreEmptiveAuthTest() {
		
	
		
	}
}
