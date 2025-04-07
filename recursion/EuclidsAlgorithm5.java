package recursion;

public class EuclidsAlgorithm5 {

	public static void main(String[] args) {
		int a = 52, b = 2;
		EuclidsAlgorithm euclidsAlgorithm = new EuclidsAlgorithm();
		System.out.println(euclidsAlgorithm.getNum(a, b));
	}
}

class EuclidsAlgorithm{
	public int getNum(int a, int b) {
		if(a%b==0)
			return b;
		return getNum(b, a%b); 
	}
}
//How to calculate Greatest Common Division GCD using Euclid's algorithm using recursion?
