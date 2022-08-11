package DifferentWaysTo_Post_Operation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectFromJsonFile {

	
	@Test
	public void CreateProjectFromJsonFile() {
		
		baseURI="http://localhost:8084";
		
		File file=new File(".\\src\\test\\resources\\requestdata\\RequestData");
		
		given().body(file)
		.contentType(ContentType.JSON)
		.when().post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
	}
}
