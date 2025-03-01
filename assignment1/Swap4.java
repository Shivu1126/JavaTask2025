package assignment1;

public class Swap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap4 swap = new Swap4();
		swap.swap();
	}
	public void swap() {
		int a = 10;
		int b = 12;
		System.out.println("a = "+a+", b="+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = "+a+", b="+b);
	}
}
