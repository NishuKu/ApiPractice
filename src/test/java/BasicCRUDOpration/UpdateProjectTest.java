package BasicCRUDOpration;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	@Test
	public void updateProject() {
		// step 1: create neccessary data
				JSONObject jobj=new JSONObject();
				jobj.put("createobject", "create");
				jobj.put("projectname", "tyss");
				
				//step 2: send the request
				RequestSpecification request= RestAssured.given();
				request.body(jobj);
				request.contentType(ContentType.JSON);
				Response resp =request.post("http://localhost:8084/addProject");
				
				//step 3:
				resp.then().log().all();
	}
}
