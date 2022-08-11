package GenericLibrary;

import io.restassured.response.Response;

/**
 * 
 * this classs contains rest assured specification reusable method
 * @author nishu
 *
 */
public class RestAssuredLibrary {

	//Remove test from pom.xml in rest assured dependency
	public String getJsonData(Response response,String path) {
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
}
