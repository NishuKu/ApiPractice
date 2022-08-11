package serializationAndDeserialization;

import org.omg.CORBA.Object;
import org.testng.annotations.Test;

public class Spouse {

	@Test
	public String spouse() {
		String name="yyy";
		int age =23;
		return name+" "+age;
	}
	
}
 