package GenericLibrary;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseAPIClass {

	public DataBaseLibrary dbLib = new DataBaseLibrary();
	public JavaLibrary jlib = new JavaLibrary();
	public RestAssuredLibrary rLib =new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException {
		
		dbLib.connectToDtabase();
		Reporter.log("=== Connection Successfully====", true);
		baseURI="http://localhost";
		port = 8084;
	}
	
	@AfterSuite
	public void asConfig() throws SQLException {
		dbLib.closeDatabase();
		Reporter.log("====connection closed====", true);
	}
	
	
}
