package recursion;

public class SumOfDigits7 {

	public static void main(String[] args) {
		int n = 148952;
		System.out.println(new SumOfDigits().getSumOfDigits(n));
	}

}
class SumOfDigits{
	public int getSumOfDigits(int n) {
		if(n<=0)
			return 0;
		return n%10 + getSumOfDigits(n/10);
	}
}
//How to calculate the sum of digits using recursion in Java?
