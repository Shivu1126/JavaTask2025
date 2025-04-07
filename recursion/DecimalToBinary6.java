package recursion;

public class DecimalToBinary6 {

	public static void main(String[] args) {
		int n = 13;
		DecimalToBinary decimalToBinary = new DecimalToBinary();
		
		System.out.println(decimalToBinary.getBinary(n));
	}
}
class DecimalToBinary{
	public int getBinary(int n) {
		if(n<=1)
			return n;
		return (n%2)+ getBinary(n/2)*10;
	}
}
//Write a Java program to convert Decimal to binary using recursion.