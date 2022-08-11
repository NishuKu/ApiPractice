package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


import static io.restassured.RestAssured.*;

import java.util.Random;

public class Oauth2_0 {


	@Test
	public void baseOauth2_0() {
		Random r=new Random();
		int num=r.nextInt(2000);
		baseURI="http://coop.apps.symfonycasts.com";
		
		//Step 1: Generate the access token
	Response res = given()
		.formParam( "client_id","SDET36_Tyss")
		.formParam("client_secret","19bb0d66111591b9e979576a721c72c4")
		.formParam("redirect_uri ", "http://nishusworld.com")
		.formParam("grant_type" , "client_credentials")
		.formParam("code", "authorization_code")

		.when().post("/token");
			
		//Step 2 : capture the access token using json path
		String token = res.jsonPath().get("access_token");
		System.out.println(token);

		//Step 3: Utilise the access token
		given().auth().oauth2(token)
		.pathParam("USER_ID", 3668)
		.when().post("/api/{USER_ID}/chickens-feed")
		.then().log().all();
		
	}
}
