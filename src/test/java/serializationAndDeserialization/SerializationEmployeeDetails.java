package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;

public class SerializationEmployeeDetails {

	@Test
	public void serializationEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException {
		
		//Create an object pojo class and give value
		EmployeeDetails emp=new EmployeeDetails("aaa", 23, "aa@gmail.com", "gfgfbgb", 7867);

		//creaete object for ObjectMapper comes under jackson mapper
		ObjectMapper obj=new ObjectMapper();

		//call a method to write the value
		obj.writeValue(new File("./Employeedetails.json"), emp);

	}
}
