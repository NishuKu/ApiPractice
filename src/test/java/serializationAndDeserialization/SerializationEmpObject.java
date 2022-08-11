package serializationAndDeserialization;

import org.omg.CORBA.Object;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmpWithObject;

public class SerializationEmpObject {
	
	@Test
	public void serializationEmpArrayObject() {
		String[] email= {"@gmail.com",""};
		int [] phn= {898656,6788};
		Spouse sp=new Spouse();
		
		//EmpWithObject obj=new EmpWithObject("yyyy", 24, email, phn, "", sp.spouse());
		
		
	}

}
