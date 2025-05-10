package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String phoneNumber = scanner.next();
		String message = "Please enter proper phone number..";
		try {
			if(phoneNumber.length()!=10)
				throw new InputMismatchException(message);
			for(int i=0;i<phoneNumber.length();i++) {
				if(!(phoneNumber.charAt(i)>='0' && phoneNumber.charAt(i)<='9'))
					throw new InputMismatchException(message);
			}
			System.out.println("Valid phone number.");
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
