package Request_Chaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.annotations.Test;

import POJOClasses.ProjectLibrary;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_Update_Get_Delete_Project {


	@Test
	public void create_Update_Get_Delete_Project() {

		baseURI="http://localhost:8084";
		Random r=new Random();
		int num=r.nextInt(2000);
		baseURI="http://localhost:8084";

		//Step 1: Create data
		ProjectLibrary pojo=new ProjectLibrary("Nishu", "Tyss"+num, "Created", 24);

		//step 2:send the post request
		Response res = given()
				.body(pojo)
				.contentType(ContentType.JSON)
				.when().post("/addProject");

		Object projectId = res.jsonPath().get("projectId");
		//Step 4: To Update the Project
		ProjectLibrary pojo2=new ProjectLibrary("Nishu", "RmgYantra", "Updated", 20);

		System.out.println(pojo2);
		given().body(pojo2)
		.contentType(ContentType.JSON)
		.when().put("/projects/"+projectId)
		.then().log().all();


		//request.body(pojo2);
		//request.contentType(ContentType.JSON);

		//step 5: captured projectid from the response body using json path
		String projId = res.jsonPath().get("projectId");
		System.out.println(projId);


		//Step :6 Use the captured project id in get request
		given()
		.pathParam("pid",projId )
		.when().get("/projects/{pid}")
		.then().log().all();

		//Step 7: use the project id to Delete th request

		given()
		.pathParam("pid",projId )
		.when().delete("/projects/{pid}")
		.then().log().all();

	}
}
