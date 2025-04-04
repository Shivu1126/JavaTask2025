package assignment11Abstract.employeemanagement;

public abstract class Employee {
	private int empId;
	private String empName;
	private String empRole;
	private String phoneNumber;
	private String email;
	
	public Employee(int empId, String empName, String empRole, String phoneNumber, String email) {
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Name : "+empName);
		System.out.println("EmpId : "+empId);
		System.out.println("EmpRole : "+empRole);
		System.out.println("PhoneNumber : "+phoneNumber);
	}
	abstract public int calculatePay();
}
