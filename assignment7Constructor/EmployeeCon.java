package assignment7Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee{
	private int empId;
	private String empName;
	private String empRole;
	private int empSalary;
	private String phoneNumber;
	private String email;
	
	public Employee(int empId, String empName, String empRole, int empSalary, String phoneNumber, String email) {
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.empSalary = empSalary;
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
public class EmployeeCon {
	static Scanner scanner = new Scanner(System.in);
	static List<Employee> empList = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeCon empCon = new EmployeeCon();
		int option = 0;
		do{
			System.out.println("1. Add Employee");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			option = scanner.nextInt();
			if(option==1) {
				empCon.addEmployee();
			}
			else if(option==2) {
				if(empList.isEmpty())
					System.out.println("Empty List..");
				else {
					for(Employee emp : empList)
						System.out.println(emp.toString());
				}
			}
				
		}while(option!=3);
	}
	public void addEmployee() {
		System.out.println("Enter id");
		int id = scanner.nextInt();
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter role");
		String role = scanner.next();
		System.out.println("Enter salary");
		int salary = scanner.nextInt();
		System.out.println("Enter phonenumber");
		String phoneNumber = scanner.next();
		System.out.println("Enter email");
		String mail = scanner.next();
		
		empList.add(new Employee(id, name, role, salary, phoneNumber, mail));
	}
}
