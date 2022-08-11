package DifferentWaysTo_Post_Operation;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreatePojectFromFormParameter {

	@Test
	public void createPojectFromFormParameter() {

		baseURI="http://localhost:8084";

		Random ran=new Random();
		int num=ran.nextInt(2000);

		given()
		.formParam("createdBy", "Nishu")
		.formParam("projectName", "Tyss"+num)
		.formParam("status", "creates")
		.formParam("teamSize", 20)
		
		.contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then()
		.assertThat().statusCode(201).log().all();
	}
}
