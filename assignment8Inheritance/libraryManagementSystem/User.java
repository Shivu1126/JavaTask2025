package assignment8Inheritance.libraryManagementSystem;

public class User {
	private String userID;
	private String name;
	private int age;
	private String phoneNumber;
	private String email;
	private String password;
	
	public User(String userID, String name, int age, String phoneNumber, String email, String password) {
		this.userID = userID;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", password=" + password + "]";
	}
	
}
