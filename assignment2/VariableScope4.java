package assignment2;

public class VariableScope4 {

	public static void main(String[] args) {
		int a = 10;
		if(a==10) {
			int b = 5;
			System.out.println("a = "+a+", b = "+b);
		}
//		System.out.println("a = "+a+", b = "+b); 
//		It throws the compiler error. Because variable 'b' scope is only inside the if block.
	}

}
