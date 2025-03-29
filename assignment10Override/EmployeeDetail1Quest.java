package assignment10Override;
import assignment7Constructor.Employee;

class HourlyEmployee extends Employee{
	int hoursWorked;
	int salaryPerHour;
	public HourlyEmployee(int empId, String empName, String empRole, int empSalary, String phoneNumber, String email,
			int hoursWorked, int salaryPerHour) {
		super(empId, empName, empRole, empSalary, phoneNumber, email);
		this.hoursWorked = hoursWorked;
		this.salaryPerHour = salaryPerHour;
	}
	@Override
	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("HOURS WORKED - "+hoursWorked);
		System.out.println("Salary Per Hour - "+salaryPerHour);
		System.out.println("Total Salary - "+(hoursWorked*salaryPerHour));
	}
	
}
class SalariedEmployee extends Employee{
	int annualSalary;
	public SalariedEmployee(int empId, String empName, String empRole, int empSalary, String phoneNumber,
			String email, int annualSalary) {
		super(empId, empName, empRole, empSalary, phoneNumber, email);
		this.annualSalary = annualSalary;
	}
	@Override
	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Annual Salary - "+annualSalary);
	}
}


public class EmployeeDetail1Quest {

	public static void main(String[] args) {
		Employee emp = new HourlyEmployee(11, "VIRAT", "Designer", 0, "8181818181", "virat@gmail.com", 85, 100);
		emp.getEmployeeDetails();
		System.out.println();
		emp = new SalariedEmployee(12, "KOHLI", "Software Developer", 0, "7871060695", "kohli@gmail.com", 800000);
		emp.getEmployeeDetails();
		
	}

}
