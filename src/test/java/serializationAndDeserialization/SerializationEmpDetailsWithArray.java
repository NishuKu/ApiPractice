package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class SerializationEmpDetailsWithArray {

	@Test
	public void serilizationEmpWithArrayTest() throws JsonGenerationException, JsonMappingException, IOException {
		int [] phone= {65467687,67587};
		String [] email= {"n@gmail.com","Ty@gmail.com"};
		
		//create object for pojo class and give value
		EmployeeDetailsWithArray array=new EmployeeDetailsWithArray("Nishu", 24, phone, email, "tyyss ");
		
		//create object for object mapper class
		ObjectMapper obj=new ObjectMapper();
		
		//create method to write the value
		obj.writeValue(new File("./EmpArray.json"),array);
		
	}
}
