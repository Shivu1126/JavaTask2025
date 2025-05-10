package exceptionhandling.banking;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		Customer customer = new Customer("Shivv", 8000);
		bank.viewBalance(customer);
		
		try {
			bank.depositAmount(1000, customer);
//			bank.depositAmount(-500, customer);
//			bank.withdrawAmount(-914, customer);
			bank.withdrawAmount(90103, customer);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public void viewBalance(Customer customer) {
		System.out.println("Balance : "+customer.getAccountBalance());
	}
	public void depositAmount(int amount, Customer customer) throws InsufficientBalanceException {
		if(amount<=0){
			throw new InsufficientBalanceException("Enter valid amount");
		}
		else {
			customer.setAccountBalance(amount+customer.getAccountBalance());
			System.out.println("Deposit Rs."+amount+" successfully done.");
			viewBalance(customer);
		}
	}
	public void withdrawAmount(int amount, Customer customer) throws InsufficientBalanceException {
		if(amount<=0)
			throw new InsufficientBalanceException("Enter valid amount");
		else if(customer.getAccountBalance()<amount)
			throw new InsufficientBalanceException("Your balance is only "+customer.getAccountBalance());
		else
		{
			customer.setAccountBalance(customer.getAccountBalance()-amount);
			System.out.println("Withdraw Rs."+amount+" successfully done.");
			viewBalance(customer);
		}
	}
}
