package DifferentWaysTo_Post_Operation;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectFromHashmap {

	@Test
	public void createProjectFromHashmap() {
		
		Random ran=new Random();
		int num=ran.nextInt(2000);
		
		baseURI="http://localhost";
		port=8084;
		
		HashMap map= new HashMap();
		map.put("createdBy", "Nishu");
		map.put("projectName", "Tyss"+num);
		map.put("status", "created");
		map.put("teamSize", 12);
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		.when().post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
	}
}
