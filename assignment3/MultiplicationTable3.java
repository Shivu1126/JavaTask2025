package assignment3;

import java.util.Scanner;

public class MultiplicationTable3 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		MultiplicationTable3 multi = new MultiplicationTable3();
		System.out.println("Enter the number...");
		int num = scanner.nextInt();
		multi.showTable(num);
	}
	public void showTable(int num) {
		for(int i=1;i<=10;i++)
			System.out.println(i+" * "+num+" = "+(i*num));
	}
}
