package units;

/**
 * For this project the employee depends on the existence of a person object, but is independent of a company object.
 * Most of these functions will only be used when a new object instance is created. A SQL translator would need to be 
 * used if an SQL record needs to be turned into an object.
 * 
 * @author mjgbenigno
 *
 */
public class Employee extends Person{
	private String employeeFirstName = null;
	private String employeeLastName = null;
	private int employeeID = -1; 
	private String employeeSSN = null;
	private int employeePhoneNumber = 0;
	private String employeeEmail = null;
	
	private double salary = -666.0;
	private double payRate = -666.0;
	private double overtimeRate = 1;
	
	private Person currentPerson;
	
	/**
	 * Invoke this constructor IF and ONLY IF a person already exists. 
	 * If a person does not exist then create a new person object, then pass that object to this constructor.
	 * 
	 * This constructor will use the existing person ID as its ID.
	 * @param person an object of type Person
	 */
	public Employee(Person person) {
		currentPerson = person; 
		employeeFirstName = person.getFirstName();
		employeeLastName = person.getLastName();
		employeeID = person.getID();
		employeeSSN = person.getSSN();
	}
	
	/**
	 * For testing purposes.
	 * 
	 * Invoke this constructor if you wish to assign a different ID to an employee object, may cause unwanted problems due to a mismatch of ID's. 
	 * If you need to retrieve the person's ID after using this constructor call getPersonID()
	 *  
	 * @param person an object of type Person
	 * @param ID custom ID
	 */
	public Employee(Person person, int ID) {
		currentPerson = person;
		employeeFirstName = person.getFirstName();
		employeeLastName = person.getLastName();
		employeeID = ID;
		employeeSSN = person.getSSN();
	}
	
	public void setEmployeePhoneNumber(int phnNumber) {
		this.employeePhoneNumber = phnNumber;
	}
	
	public void setEmployeeEmail(String email) {
		this.employeeEmail = email;
	}
	
	public void setEmployeeOvertimeRate(double rate) {
		this.overtimeRate = rate;
	}
	
	public String getEmployeeFirstName() {
		return this.employeeFirstName;
	}
	
	public String getEmployeeeLastName() {
		return this.employeeLastName;
	}
	
	public String getEmployeeFullName() {
		return this.employeeFirstName + this.employeeLastName;
	}
	
	public long getEmployeeID() {
		return this.employeeID;
	}
	
	public String getEmployeeSSN() {
		return this.employeeSSN;
	}
	
	public int getEmployeePhoneNumber() {
		return this.employeePhoneNumber;
	}
	
	public String getEmployeeEmail() {
		return this.employeeEmail;
	}
	
	public double getEmployeeSalary() {
		return this.salary;
	}
	
	public double getEmployeePayRate() {
		return this.payRate;
	}
	
	public double getOvertimeRate() {
		return this.overtimeRate;
	}
	
	/**
	 * Retrieves the ID of the person that this employee is based on. 
	 * If the object was constructed without specifying the ID then this should reflect what getEmployeeID() shows.
	 * 
	 * @return ID of type long
	 */
	public long getPersonID() {
		return currentPerson.getID();
	}
	
	public Person getPersonalReference() {
		return this.currentPerson;
	}
	
	//TODO 
	public void getEmployeePayroll() {
		
	}
	
	/**
	 * Testing purposes.
	 */
	public void printFullData() {
		System.out.println("\n\n");
		System.out.println("This Object ID: " + this);
		System.out.println();
		System.out.println("Employee ID: " + this.employeeID);
		System.out.println("Employee SSN: " + this.employeeSSN);
		System.out.println("Employee First Name: " + this.employeeFirstName);
		System.out.println("Employee Last Name: " + this.employeeLastName);
		System.out.println();
		System.out.println("Referenced Object ID: " + currentPerson);
		System.out.println("Referenced Person ID: " + this.currentPerson.getID());
		System.out.println("Referenced Person SSN: " + this.currentPerson.getSSN());
		System.out.println("Referenced Person First Name: " + this.currentPerson.getFirstName());
		System.out.println("Referenced Person Last Name: " + this.currentPerson.getLastName());
	}
	
}
