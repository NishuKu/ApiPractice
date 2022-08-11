package DifferentWaysTo_Post_Operation;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectFromPojoClass {

	@Test
	public void createProjectFromPojoClass() {
		Random ran=new Random();
		int num= ran.nextInt(2000);

		baseURI ="http://localhost:8084";
		
		ProjectLibrary pojo= new ProjectLibrary("Nishu", "Tyss"+num, "created", 12);
		
		given().body(pojo).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
		
	}
}
