package assignment3;

public class PrimeNumber5 {
//Write a program to print prime numbers between 1 to 30
	public static void main(String[] args) {
		System.out.print(2);
		for(int i=3;i<=30;i++) {
			boolean isPrime = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(" "+i);
		}
	}

}
