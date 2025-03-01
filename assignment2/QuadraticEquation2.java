package assignment2;

public class QuadraticEquation2 {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 1;
		int bSq = b*b;
		b = -b;
		int fAc = 4*a*c;
		int inRoot = bSq-fAc;
		int tA = 2*a;
		
		System.out.println((b+Math.sqrt(inRoot))/tA);
		System.out.println((b-Math.sqrt(inRoot))/tA);
	}

}
