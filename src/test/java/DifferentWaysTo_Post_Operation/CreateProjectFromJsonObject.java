package DifferentWaysTo_Post_Operation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectFromJsonObject {

	@Test
	public void createProjectFromJsonObject() {
	
		baseURI="http://localhost:8084";
		
		Random ran=new Random();
		int num= ran.nextInt(2000);

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
