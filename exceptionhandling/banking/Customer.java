package exceptionhandling.banking;

public class Customer {
	private String userName;
	private int accountBalance;
	public Customer(String userName, int accountBalance) {
		this.userName = userName;
		this.accountBalance = accountBalance;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
