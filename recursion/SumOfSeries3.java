package recursion;

public class SumOfSeries3 {

	public static void main(String[] args) {
		int n = 7;
		SumOfSeries sumOfSeries = new SumOfSeries();
		System.out.println(sumOfSeries.getSumOfSeries(n));
	}
}
class SumOfSeries{
	public int getSumOfSeries(int n) {
		if(n==1)
			return 1;
		return n + getSumOfSeries(n-1);
	}
}
//How to calculate the sum of arithmetic series from 1 to N, using recursion?