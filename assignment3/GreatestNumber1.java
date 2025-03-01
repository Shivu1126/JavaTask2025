package assignment3;

import java.util.Scanner;

public class GreatestNumber1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers...");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a<b) {
			if(b<c) {
				System.out.println("Greatest Number : "+c);
			}
			else {
				System.out.println("Greatest Number : "+b);
			}
		}
		else {
			if(a>c)
				System.out.println("Greatest Number : "+a);
			else
				System.out.println("Greatest Number : "+c);
		}
	}

}
