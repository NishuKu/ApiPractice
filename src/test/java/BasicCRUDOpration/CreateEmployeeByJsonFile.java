package BasicCRUDOpration;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CreateEmployeeByJsonFile {
@Test
public void createEmployeeByJsonFile() {
	JSONObject obj=new JSONObject();
	obj.put("designation", "QA");
	obj.put("dob", "01/11/1111");
	obj.put("email", "john123@gmail.com");
	obj.put("empName", "john4546");
}
	
}
