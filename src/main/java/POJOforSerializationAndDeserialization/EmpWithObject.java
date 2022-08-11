package POJOforSerializationAndDeserialization;

import org.omg.CORBA.Object;
import org.testng.annotations.Test;

public class EmpWithObject {
	
	String name;
	int age;
	String[] email;
	int[] phno;
	String adress;
	Object Spouse;

	public EmpWithObject(String name, int age, String[] email, int[] phno, String adress, Object spouse) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phno = phno;
		this.adress = adress;
		this.Spouse = spouse;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String[] getEmail() {
		return email;
	}
	public int[] getPhno() {
		return phno;
	}
	public String getAdress() {
		return adress;
	}
	public Object getSpouse() {
		return Spouse;
	}
}
