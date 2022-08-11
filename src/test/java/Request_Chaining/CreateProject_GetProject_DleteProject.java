package Request_Chaining;

import java.util.Random;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class CreateProject_GetProject_DleteProject {
	
	@Test
	public void createProject_GetProject_DleteProject()
	{
		
		Random r=new Random();
		int num=r.nextInt(2000);
		baseURI="http://localhost:8084";
		
		//Step 1: Creat data
		ProjectLibrary pojo=new ProjectLibrary("Nishu", "Tyss"+num, "Created", 24);
		
		//step 2:send the post request
		Response res = given()
		.body(pojo)
		.contentType(ContentType.JSON)
		.when().post("/addProject");
	
		
		//step 3: captured projectid from the response body using json path
		String projId = res.jsonPath().get("projectId");
		System.out.println(projId);
		
		//Step :4 Use the captured project id in get request
		given()
		.pathParam("pid",projId )
		.when().get("/projects/{pid}")
		.then().log().all();
		
		//Step 5: use the project id to Delete th request
		
		given()
		.pathParam("pid",projId )
		.when().delete("/projects/{pid}")
		.then().log().all();
		
		
	}
}
