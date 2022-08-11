package EndToEndSceranio;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectVerifyInData extends BaseAPIClass{

	@Test
	public void createProjectVerifyInData() throws SQLException{

		//step 1: create pre request
		ProjectLibrary plib= new ProjectLibrary("Nishu", "RmgYantra"+jlib.getRandomNum(), "Created", 12);
		
		//step 2: send the request
		Response response = given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when().post(EndPointsLibrary.createProject);
//		.then().log().all();;

		//step 3: captired the project id
		String expectedData = rLib.getJsonData(response, "projectId");
		Reporter.log(expectedData,true);//To print on the console
		
		//step 4: validate the id in database
		String query="select* from project";
		System.out.println(query);
		String actData = dbLib.readDtaFromDBAndValidate(query, 1, expectedData);
		
		Assert.assertEquals(actData, expectedData);
	}
}
