package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;
import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class DesrializationWitharray {
	
	@Test
	public void deserilizationEmpWithArray() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper obj=new ObjectMapper();
		
		//create a method to read the value
				EmployeeDetailsWithArray emp1 = obj.readValue(new File("\\EmpArray.json"), EmployeeDetailsWithArray.class);
				
				//Fetch the required value from class
				System.out.println(emp1.getAddress());
				System.out.println(emp1.getEmail());
				
		
	}

}
