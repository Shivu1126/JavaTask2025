package assignment1;

public class TypeConversion2 {

	public static void main(String[] args) {
		TypeConversion2 tc = new TypeConversion2();
		tc.typeConversion();
	}
	public void typeConversion() {
		// float to int
		float a = 13.13f;
		int b = (int) a;
		System.out.println(b);
		// double to float
		double d = 13.32431;
		float f = (float)d;
		System.out.println(f);
		//int to short
		int i = 14;
		short s = (short)i;
		System.out.println(s);
	}
}
