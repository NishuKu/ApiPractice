package POJOforSerializationAndDeserialization;

public class EmployeeDetails {

	//Declare global variable
		String name;
		int age;
		String email;
		String address;
		int phonno;

		//create a constructure to initilize
		public EmployeeDetails(String name, int age, String email, String address, int phonno) {
			this.name = name;
			this.age = age;
			this.email = email;
			this.address = address;
			this.phonno = phonno;
		}
		
		//empty constructure for deserialization
		public EmployeeDetails() {
			
		}
		//create getters and setters method
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getEmail() {
			return email;
		}

		public String getAddress() {
 			return address;
		}

		public int getPhonno() {
			return phonno;
		}



}
