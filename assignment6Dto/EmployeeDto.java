package assignment6Dto;

class Employee{
	private int empId;
	private String empName;
	private String empRole;
	private int empSalary;
	private String phoneNumber;
	private String email;
	
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
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
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
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empSalary=" + empSalary
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
}

public class EmployeeDto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Shiv");
		emp.setEmpRole("Developer");
		emp.setEmpSalary(50000);
		emp.setPhoneNumber("7871060606");
		emp.setEmail("siva@zohocorp.com");
		System.out.println(emp.toString());
	}

}
