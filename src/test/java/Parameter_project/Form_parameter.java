package Parameter_project;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Form_parameter {

	@Test
	public void form_parameter() {
		
		//step 1: create data
		baseURI="http://localhost:8084";

		Random ran=new Random();
		int num=ran.nextInt(2000);
		//step 2: send the request body
		given()
		.formParam("createdBy", "Nishu")
		.formParam("projectName", "Tyss"+num)
		.formParam("status", "creates")
		.formParam("teamSize", 20)
		
		.contentType(ContentType.JSON)
		
		.when().post("/addProject")
		
		.then().log().all();
	}
}
