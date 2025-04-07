package recursion;

public class ReverseNumbe2 {

	public static void main(String[] args) {
		int n = 10318;
		ReverseNumber reverseNumber = new ReverseNumber();
		System.out.println(reverseNumber.revNumber(n,0));
	}

}
class ReverseNumber{
	public int revNumber(int n,int i) {
		if(n<=0)
			return i;
		i = i*10 + n%10;
		return revNumber(n/10, i);
	}
}
//Program to reverse a number using recursion in Java?