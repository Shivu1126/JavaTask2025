package assignment11Abstract.employeemanagement;

class HourlyEmployee extends Employee{
	private int hoursWorked;
	private int salaryPerHour;
	public HourlyEmployee(int empId, String empName, String empRole, String phoneNumber, String email,
			int hoursWorked, int salaryPerHour) {
		super(empId, empName, empRole, phoneNumber, email);
		this.hoursWorked = hoursWorked;
		this.salaryPerHour = salaryPerHour;
	}
	@Override
	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("HOURS WORKED - "+hoursWorked);
		System.out.println("Salary Per Hour - "+salaryPerHour);
		System.out.println("Total Salary - "+ calculatePay());
	}
	@Override
	public int calculatePay() {
		return hoursWorked*salaryPerHour;
	}
	
}
class SalariedEmployee extends Employee{
	private int annualSalary;
	private int incentives;
	public SalariedEmployee(int empId, String empName, String empRole, String phoneNumber,
			String email, int annualSalary, int incentives) {
		super(empId, empName, empRole, phoneNumber, email);
		this.annualSalary = annualSalary;
		this.incentives = incentives;
	}
	@Override
	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Annual Salary - "+annualSalary);
		System.out.println("Total Salary(+Incentives) - "+calculatePay());
	}
	@Override
	public int calculatePay() {
		return annualSalary+incentives;
	}
}


public class EmployeeDetail {

	public static void main(String[] args) {
		Employee emp = new HourlyEmployee(11, "VIRAT", "Designer", "8181818181", "virat@gmail.com", 85, 100);
		emp.getEmployeeDetails();
		System.out.println();
		emp = new SalariedEmployee(12, "KOHLI", "Software Developer", "7871060695", "kohli@gmail.com", 800000, 100000);
		emp.getEmployeeDetails();
	}

}
