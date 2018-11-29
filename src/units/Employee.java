package units;

import util.Payments;
/**
 * For this project the employee depends on the existence of a person object (an employee HAS to be a person), 
 * but is independent of a company/department object. Most of these functions will only be used when a new object 
 * instance is created. A SQL translator would need to be used if an SQL record needs to be turned into an object.
 * 
 * @author mjgbenigno
 *
 */
public class Employee extends Person{
	//basic information
	private String employeeFirstName = null;
	private String employeeLastName = null;
	private int employeeID = -1; 
	private int employeeSSN = -1;
	private int employeePhoneNumber = 0;
	private String employeeEmail = null;
	private String employeeAddress = null;
	
	
	//employee specific information
	private boolean salaried = false;// set to true if employee is not paid per hour.
	private double salary = -666.0;
	private double payRatePerHour = -666.0;
	private double overtimeRate = 1;
	private String employeeDescription = null;
	
	//relation values
	private Person currentPerson;
	private Benefit empBenefit;
	private int empBenefitID;
	private Department empDept;
	private int empDepartmentID;
	
	//TODO maybe create constructor to handle creation of both person objects when an empty employee object is created.
	
	
	
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
	
	//SET Methods
	
	/**
	 * If the employee has a different phone number than the person object
	 * @param phnNumber
	 */
	public void setEmployeePhoneNumber(int phnNumber) {
		this.employeePhoneNumber = phnNumber;
	}
	
	public void setEmployeeEmail(String email) {
		this.employeeEmail = email;
	}
	
	public void setEmployeeOvertimeRate(double rate) {
		this.overtimeRate = rate;
	}
	
	public void setEmployeeBenefit(Benefit benefit) {
		this.empBenefit = benefit;
		this.empBenefitID = benefit.getBenefitID();
	}
	
	public void setEmployeeAddress(String address) {
		this.employeeAddress = address;
	}
	
	public void setEmployeeDepartment(Department dept) {
		this.empDept = dept;
		this.empDepartmentID = dept.getDepartmentID();
	}
	
	public void setSalariedStatus(boolean salaryPay) {
		this.salaried = salaryPay;
	}
	
	
	
	//GET Methods
	
	public String getEmployeeFirstName() {
		if(this.employeeFirstName == null) return this.currentPerson.firstName;
		else return this.employeeFirstName;
	}
	
	public String getEmployeeeLastName() {
		if(this.employeeLastName == null) return this.currentPerson.lastName;
		else return this.employeeLastName;
	}
	
	public String getEmployeeFullName() {
		if(this.employeeFirstName == null || this.employeeLastName == null) return currentPerson.firstName + currentPerson.lastName;
		else return this.employeeFirstName + this.employeeLastName;
	}
	
	public long getEmployeeID() {
		return this.employeeID;
	}
	
	public int getEmployeeSSN() {
		return this.employeeSSN;
	}
	
	public int getEmployeePhoneNumber() {
		if(this.employeePhoneNumber == 0) return this.currentPerson.personalPhoneNumber;
		else return this.employeePhoneNumber;
	}
	
	public String getEmployeeEmail() {
		if(this.employeeEmail == null) return this.currentPerson.personalEmailAddress;
		else return this.employeeEmail;
	}
	
	public double getEmployeeSalary() {
		return this.salary;
	}
	
	public double getEmployeePayRate() {
		return this.payRatePerHour;
	}
	
	public double getOvertimeRate() {
		return this.overtimeRate;
	}
	
	public String getEmployeeBenefitName() {
		return this.empBenefit.getBenefitName();
	}
	
	public int getEmployeeBenefitID() {
		return this.empBenefitID;
	}
	
	public String getEmployeeAddress() {
		return this.employeeAddress;
	}

	public String getJobDescription() {
		return this.employeeDescription;
	}
	
	public String getEmployeeDepartment() {
		return this.empDept.getDepartmentName();
	}
	
	public int getEmployeeDepartmentID() {
		return this.empDepartmentID;
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
	
	public double getEmployeePayroll(double hoursWorked) {
		Payments payments = new Payments();
		
		if (!salaried) {
			if (hoursWorked > 40) {
				//overtime pay
				return payments.getPayPerHour(this, 40.0, hoursWorked - 40.0);
			} else {
				//regular pay
				return payments.getPayPerHour(this, hoursWorked);
			} 
		} else if (salaried) {
			return this.salary;
		}
		
		//this event shouldn't happen; if it does something went wrong.
		return -987654321.0;
	}
	
	public boolean getSalaryStatus() {
		return this.salaried;
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
