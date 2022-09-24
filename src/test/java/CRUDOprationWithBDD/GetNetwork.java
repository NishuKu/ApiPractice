package CRUDOprationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;


public class GetNetwork {

	@Test
	public void getNetwork() {
		baseURI="http://localhost:8084";

		when().get( "/projects/TY_PROJ_1607").
		then().assertThat().log().all();

	}
}
