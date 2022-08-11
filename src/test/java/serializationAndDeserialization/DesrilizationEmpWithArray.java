package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;
import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class DesrilizationEmpWithArray {

	@Test
	public void deserializationEmpWitharray() throws JsonParseException, JsonMappingException, IOException {
		//create object of Object Mapper coming from Jackson Mapper
				ObjectMapper obj=new ObjectMapper();
				
				//create a method to read the value
				EmployeeDetails emp1 = obj.readValue(new File(".\\Employeedetails.json"), EmployeeDetails.class);
				
				//Fetch the required value from class
				System.out.println(emp1.getAddress());
				System.out.println(emp1.getEmail());

	}
}
