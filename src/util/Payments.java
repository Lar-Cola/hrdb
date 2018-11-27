package util;

import units.Employee;

/**
 * 
 * @author mjgbenigno
 *
 */
public class Payments {
	
	public Payments() {
	}
	
	/**
	 * Simple payroll calculation without overtime hours
	 * @param e
	 * @param hours
	 * @return
	 */
	public double getPayPerHour(Employee e, double hours) {
		return e.getEmployeePayRate() * hours;
	}
	
	
	/**
	 * Simple payroll calculation with overtime hours
	 * @param e
	 * @param hours
	 * @param overtimeHours
	 * @return
	 */
	public double getPayPerHour(Employee e, double hours, double overtimeHours) {
		return (e.getEmployeePayRate()* hours) + (e.getOvertimeRate() * overtimeHours);
	}
	
	public double getPayPerHour(double payrate, double hours) {
		return payrate * hours; 
	}
	
	public double getPayPerHour(double payrate, double hours , double overtimeRate, double overtimeHours) {
		return (payrate * hours + (overtimeRate * overtimeHours));
	}
	
}
