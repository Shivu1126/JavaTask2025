package exceptionhandling;

public class DivideException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 24;
		int b = 0;
		try {
			System.out.println("Result: "+a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Not divide by zero");
		}
	}

}
