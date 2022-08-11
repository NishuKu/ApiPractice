package Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BeareerToken {
	@Test
	public void beareerToken() {
		//Step 1: create pr requestes
		HashMap map=new HashMap();
		map.put("name", "SDET-beareer");
		map.put("description", "API framwork");
		
		given()
		.auth()
		.oauth2("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")
		.body(map)
		.contentType(ContentType.JSON)
		
		//step :2 
		.when().post("https://api.github.com/user/repos").then().log().all();
	}

}
