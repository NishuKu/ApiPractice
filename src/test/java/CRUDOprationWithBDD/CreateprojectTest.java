package CRUDOprationWithBDD;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateprojectTest {

	@Test
	public void createprojectTest() {
		baseURI="http://localhost";
		port=8084;
		Random r=new Random();
		int num = r.nextInt(100);
		//Step 1: create data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Nishu");
		jobj.put("projectName", "tyss"+num);
		jobj.put("status", "created");
		jobj.put("teamSize", 20);

		//step 2:send request and validation
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
	}
}
