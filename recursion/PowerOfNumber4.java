package recursion;

public class PowerOfNumber4 {

	public static void main(String[] args) {
		PowerOfNumber powerOfNumber = new PowerOfNumber();
		int n = 3, val = 3;
		System.out.println(powerOfNumber.getPowerOf(n, val));
	}
}
class PowerOfNumber{
	public int getPowerOf(int n, int val) {
		if(val==1)
			return n;
		return n* getPowerOf(n, val-1);
	}
}
//How to calculate the power of a number like power(int number, int power) like power(2, 3) should return 8, using recursion?