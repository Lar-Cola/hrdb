package units;

public class Person {
	protected String firstName = null;
	protected String lastName = null;
	protected int SSN = -1;
	protected int personalPhoneNumber = 0;
	protected int ID = -1;
	protected String personalEmailAddress = null;
	
	/**
	 * Create a person without an identity.
	 */
	public Person() {
		
	}
	
	/**
	 * Create a person with an identity
	 * @param first first name of person
	 * @param last last name of person
	 * @param SSN A person's SSN number
	 * @param ID A person's ID number
	 */
	public Person(String first, String last, int SSN, int ID) {
		this.firstName = first;
		this.lastName = last;
		this.SSN = SSN;
		this.ID = ID;
	}
	
	//SET Methods
	
	public void setFirstName(String s) {
		this.firstName = s;
	}
	
	public void setLastName(String s) {
		this.lastName = s;
	}
	
	public void setSSN(int i) {
		this.SSN = i;
	}
	
	public void setID(int id) {
		this.ID = id;
	}
	
	public void setPersonalPhoneNumber(int phone) {
		this.personalPhoneNumber = phone;
	}
	
	public void setPersonalEmail(String email) {
		this.personalEmailAddress = email;
	}
	
	//GET Methods
	
	public String getFirstName() {
		if(firstName == null) return "First name was not set.";
		return this.firstName;
	}
	
	public String getLastName() {
		if(lastName == null) return "Last name was not set.";
		return this.lastName;
	}
	
	public String getFullName() {
		if(firstName == null || lastName == null) return "Name was not set.";
		return this.firstName + this.lastName;
	}
	
	public int getSSN() {
		if(SSN == -1) System.out.println("This SSN was not set.");;
		return this.SSN; //Returns a raw output of the SSN; Implement a security lock whenever
	}
	
	public int getID() {
		return this.ID;
	}

	public int getPersonalPhoneNumber() {
		return this.personalPhoneNumber;
	}

	public String getPersonalEmail() {
		return this.personalEmailAddress ;
	}
	
	public void printFullData() {
		System.out.println("\n\n");
		System.out.println("This object ID: "+ this);
		System.out.println();
		System.out.println("Person First Name: "+this.firstName);
		System.out.println("Person Last Name: "+this.lastName);
		System.out.println("Person ID: "+ this.ID);
		System.out.println("Person SSN: "+ this.SSN);
	}
}
