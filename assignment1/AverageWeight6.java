package assignment1;

import java.util.Scanner;

public class AverageWeight6 {

	public static void main(String[] args) {
		AverageWeight6 aw = new AverageWeight6();
		aw.average();
	}

	public void average()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of persons :");
		int n = scanner.nextInt();
		int weightSum = 0;
		System.out.println("Enter the weights");
		for(int i=0;i<n;i++) {
			weightSum += scanner.nextInt();
		}
		System.out.println("Weight of 10 persons : "+weightSum);
		System.out.println("Average of 10 persons : "+(weightSum/(float)n));
		scanner.close();
	}
}
