package CRUDOprationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateNetwork {

	@Test
	public void createNetwork() {
		baseURI="http://localhost:8084";
		
		Random r=new Random();
		int ran=r.nextInt(1000);
		
		//create data
		JSONObject ob=new JSONObject();
		ob.put("createdBy", "nishu");
		ob.put("projectName", "tyss"+ran);
		ob.put("status", "created");
		ob.put("teamSize", 20);
		
		//send request
		given().
		body(ob).
		contentType(ContentType.JSON).
		when().
		post("/addProject").
		then().assertThat().log().all();
		
	}
}
