package util;

import units.Employee;

/**
 * This class exists to provide an easy way to compute payments for an employee.
 * @author mjgbenigno
 *
 */
public class Payments {
	
	public Payments() {
	}
	
	public double getPayPerHour(Employee e, double hours) {
		return e.getEmployeePayRate() * hours;
	}
	
	public double getPayPerHour(Employee e, double hours, double overtimeHours) {
		return (e.getEmployeePayRate()* hours) + (e.getOvertimeRate() * overtimeHours);
	}
	
}
