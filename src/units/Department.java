package units;

import java.util.ArrayList;

public class Department {
	
	private int departmentID = -1;
	private String departmentName = null;
	
	private ArrayList<Employee> departmentEmployees = new ArrayList<>();
	
	public Department() {
		
	}
	
	public Department(String name, int ID) {
		this.departmentID = ID;
		this.departmentName = name;
	}
	
	public void setDepartmentName(String name) {
		this.departmentName = name;
	}
	
	public void setDepartmentID(int ID) {
		this.departmentID = ID;
	}
	/**
	 * Adds an Employee object to the ArrayList of a Department object
	 * @param newemployee employee object to add to list
	 */
	public void addDepartmentEmployee(Employee newemployee) {
		this.departmentEmployees.add(newemployee);
	}
	
	public int getDepartmentSize() {
		return this.departmentEmployees.size();
	}
	
	/**
	 * Testing Purposes only
	 */
	public void listDepartmentEmployees() {
		
		if (departmentEmployees.size()!=0) {
			for (int i = 0; i < departmentEmployees.size(); i++) {
				System.out.println(departmentEmployees.get(i).getEmployeeFullName());
			}
		}
	}
	
	public String getDepartmentName() {
		return this.departmentName;
	}
	
	public int getDepartmentID() {
		return this.departmentID;
	}
}
