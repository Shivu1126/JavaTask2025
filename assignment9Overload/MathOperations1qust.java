package assignment9Overload;

public class MathOperations1qust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations math = new MathOperations();
		System.out.println("10 + 10 = "+math.add(10, 10));
		System.out.println("90.3 + 90 = "+math.add(90.3, 90));
		System.out.println("1.130 + 12.410 = "+math.add(1.136035, 12.410));
		System.out.println("1982258920 + 12582980 = "+math.add(1982258920, 12582980));
		System.out.println("10 x 10 = "+math.multiply(10, 10));
		System.out.println("90.3 x 90 = "+math.multiply(90.3, 90));
		System.out.println("1.136035 x 12.410 = "+math.multiply(1.136035, 12.410));
		System.out.println("1982258920 x 12582980 = "+math.multiply(10, 10));
		System.out.println("120 / 10 = "+math.divide(120, 10));
		System.out.println("120.5 / 11 = "+math.divide(120.5, 11));
		System.out.println("15.243225 / 5.00 = "+math.divide(15.243225, 5.00));
		System.out.println("1982258920 / 12582980 = "+math.divide(1982258920, 12582980));
	}

}
class MathOperations{
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
	}
	public long add(long a, long b) {
		return a+b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	public float multiply(float a, float b) {
		return a*b;
	}
	public long multiply(long a, long b) {
		return a+b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
	public float divide(float a, float b) {
		return a/b;
	}
	public long divide(long a, long b) {
		return a/b;
	}
}